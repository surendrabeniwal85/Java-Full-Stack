package ModernJava.Day17;

import java.time.Year;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutionException;

// Employee salary calculation using Callable, Future,
// utility class, shallow copy, and immutable company information.

public class a02 {

    // Fixed company name.
    private static final String VALID_COMPANY = "HCLTech";

    // Immutable class: company information cannot be modified.
    private static final class CompanyInfo {
        private final String companyName;
        private final String address;
        private final String companyId;

        private CompanyInfo(String companyName, String address,
                            String companyId) {
            this.companyName = companyName;
            this.address = address;
            this.companyId = companyId;
        }

        private String getCompanyName() {
            return companyName;
        }

        private String getAddress() {
            return address;
        }

        private String getCompanyId() {
            return companyId;
        }
    }

    // Utility class: contains validation and helper methods.
    // Private prevents access from outside q01.
    private static final class EmployeeUtils {

        private EmployeeUtils() {
            // Prevent object creation for this utility class.
        }

        // Only HCLTech is accepted; ignore surrounding spaces
        // and differences in letter case.
        private static boolean isValidCompany(String name) {
            return name != null
                    && VALID_COMPANY.equalsIgnoreCase(name.trim());
        }

        // Creates the approved immutable company object.
        private static CompanyInfo createCompany(String name) {
            if (!isValidCompany(name)) {
                throw new IllegalArgumentException(
                        "Invalid company name. Only HCLTech is allowed.");
            }

            return new CompanyInfo(
                    VALID_COMPANY,
                    "Noida, India",
                    "HCL001"
            );
        }

        // Returns the number of days in a particular month.
        private static int getDays(int month, int year) {
            int[] days = {
                31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31
            };

            if (month == 2 && Year.isLeap(year)) {
                return 29;
            }

            return days[month - 1];
        }
    }

    // Mutable nested class for demonstrating shallow copy.
    private static final class ContactDetails {
        private String email;
        private String phone;

        private ContactDetails(String email, String phone) {
            this.email = email;
            this.phone = phone;
        }
    }

    // Employee class with private fields.
    private static final class Employee {
        private final String name;
        private final int monthlySalary;
        private final int year;
        private final CompanyInfo company;
        private final ContactDetails contact;
        private final int[] leaveDays;

        private Employee(String name, int monthlySalary, int year,
                         CompanyInfo company, ContactDetails contact,
                         int[] leaveDays) {
            this.name = name;
            this.monthlySalary = monthlySalary;
            this.year = year;
            this.company = company;
            this.contact = contact;
            this.leaveDays = leaveDays;
        }

        // Shallow copy constructor: nested references are shared.
        private Employee(Employee other) {
            this.name = other.name;
            this.monthlySalary = other.monthlySalary;
            this.year = other.year;
            this.company = other.company;
            this.contact = other.contact;
            this.leaveDays = other.leaveDays;
        }
    }

    // Separate class responsible for creating a shallow copy.
    private static final class ShallowCopy {

        private ShallowCopy() {
            // Prevent object creation for this helper class.
        }

        private static Employee create(Employee employee) {
            return new Employee(employee);
        }
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            // 1. Validate company before collecting other details.
            System.out.print("Enter company name: ");
            String companyName = sc.nextLine().trim();

            if (!EmployeeUtils.isValidCompany(companyName)) {
                System.out.println(
                        "Invalid company name. Only HCLTech is allowed.");
                return;
            }

            // Create immutable company information after validation.
            CompanyInfo company =
                    EmployeeUtils.createCompany(companyName);

            // 2. Collect employee details.
            System.out.print("Enter employee name: ");
            String name = sc.nextLine().trim();

            if (name.isEmpty()) {
                System.out.println("Employee name cannot be empty.");
                return;
            }

            System.out.print("Enter monthly salary: ");
            int salary = sc.nextInt();

            System.out.print("Enter year: ");
            int year = sc.nextInt();

            if (salary < 0 || year < 1) {
                System.out.println("Invalid salary or year.");
                return;
            }

            // 3. Collect leave days for all months.
            int[] leaves = new int[12];

            System.out.println("\nEnter leave days for each month:");

            for (int i = 0; i < 12; i++) {
                System.out.print("Month " + (i + 1) + ": ");
                leaves[i] = sc.nextInt();

                int days = EmployeeUtils.getDays(i + 1, year);

                if (leaves[i] < 0 || leaves[i] > days) {
                    System.out.println(
                            "Invalid leave days for month " + (i + 1)
                            + ". Allowed range: 0 to " + days);
                    return;
                }
            }

            // 4. Create employee and nested contact details.
            ContactDetails contact = new ContactDetails(
                    "employee@company.com",
                    "9876543210"
            );

            Employee emp = new Employee(
                    name, salary, year, company, contact, leaves
            );

            // 5. Demonstrate shallow copy through utility class.
            Employee copy = ShallowCopy.create(emp);

            System.out.println("\n--- Shallow Copy Demonstration ---");
            System.out.println("Same Employee object: " + (emp == copy));
            System.out.println("Same Company object: "
                    + (emp.company == copy.company));
            System.out.println("Same Contact object: "
                    + (emp.contact == copy.contact));
            System.out.println("Same Leave Array: "
                    + (emp.leaveDays == copy.leaveDays));

            // Changing the copied employee's shared contact
            // also affects the original employee.
            copy.contact.email = "updated@company.com";

            System.out.println("Original employee email after update: "
                    + emp.contact.email);

            // CompanyInfo is immutable and safely shared.
            System.out.println("\n--- Company Information ---");
            System.out.println("Company: "
                    + emp.company.getCompanyName());
            System.out.println("Address: "
                    + emp.company.getAddress());
            System.out.println("Company ID: "
                    + emp.company.getCompanyId());

            // 6. Callable calculates the annual salary.
            Callable<Long> task = () -> {
                long total = 0;

                for (int i = 0; i < 12; i++) {
                    int days = EmployeeUtils.getDays(i + 1, emp.year);

                    double perDay = (double) emp.monthlySalary / days;

                    long deduction = Math.round(
                            perDay * emp.leaveDays[i]);

                    long net = emp.monthlySalary - deduction;
                    total += net;

                    System.out.println(
                            "Month " + (i + 1)
                            + " | Days: " + days
                            + " | Salary: Rs. " + emp.monthlySalary
                            + " | Leave: " + emp.leaveDays[i]
                            + " | Deduction: Rs. " + deduction
                            + " | Net: Rs. " + net
                    );

                    // Delay to demonstrate background processing.
                    Thread.sleep(500);
                }

                return total;
            };

            // 7. Submit the task to a background thread.
            ExecutorService ex = Executors.newSingleThreadExecutor();

            try {
                Future<Long> future = ex.submit(task);

                System.out.println("\nProcessing salary...");

                // Wait for the result.
                long total = future.get();

                System.out.println("\n--- Annual Salary Report ---");
                System.out.println("Employee: " + emp.name);
                System.out.println("Company: "
                        + emp.company.getCompanyName());
                System.out.println("Year: " + emp.year);
                System.out.println(
                        "Annual Salary After Leave Deductions: Rs. "
                        + total);

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Salary processing was interrupted.");

            } catch (ExecutionException e) {
                System.out.println("Salary processing failed: "
                        + e.getCause());

            } finally {
                // Stop accepting new tasks and finish submitted work.
                ex.shutdown();
            }

        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter numbers "
                    + "for salary, year, and leave days.");
        }
    }
}


