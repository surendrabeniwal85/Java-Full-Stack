package ModernJava.Day10Tasks;

// 12. Display Employee Details Using Consumer

import java.util.Scanner;
import java.util.function.Consumer;

public class q12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Employee Salary: ");
        double salary = sc.nextDouble();

        Consumer<String> obj = (details) -> {
            System.out.println(details);
        };

        obj.accept("Employee Name: " + name);
        obj.accept("Employee ID: " + id);
        obj.accept("Employee Salary: " + salary);

        sc.close();
    }
}
