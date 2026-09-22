package DailyTasks.Day05;

//Complete Inheritance & Polymorphism

abstract class EmployeeT {

    String name;
    double salary;

    EmployeeT(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    abstract void work();

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

interface PayableT {

    void calculatePay();
}

class ManagerT extends EmployeeT implements PayableT {

    ManagerT(String name, double salary) {
        super(name, salary);
    }

    @Override
    void work() {
        System.out.println(name + " manages the team");
    }

    @Override
    public void calculatePay() {
        System.out.println("Manager pay: " + salary);
    }
}

class DeveloperT extends EmployeeT implements PayableT {

    DeveloperT(String name, double salary) {
        super(name, salary);
    }

    @Override
    void work() {
        System.out.println(name + " develops software");
    }

    @Override
    public void calculatePay() {
        System.out.println("Developer pay: " + salary);
    }
}

public class q20 {

    public static void main(String[] args) {

        EmployeeT employee;

        employee = new ManagerT("Rahul", 60000);

        employee.displayDetails();
        employee.work();

        PayableT payable = (PayableT) employee;
        payable.calculatePay();

        System.out.println();

        employee = new DeveloperT("Surendra", 50000);

        employee.displayDetails();
        employee.work();

        payable = (PayableT) employee;
        payable.calculatePay();
    }
}