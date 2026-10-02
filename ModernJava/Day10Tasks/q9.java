package ModernJava.Day10Tasks;

// 9. Calculate Employee Salary After 10% Bonus Using Function

import java.util.Scanner;
import java.util.function.Function;

public class q9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Salary: ");
        double salary = sc.nextDouble();

        Function<Double, Double> obj = (s) -> {
            return s + (s * 10 / 100);
        };

        System.out.println("Salary after 10% bonus: " + obj.apply(salary));

        sc.close();
    }
}
