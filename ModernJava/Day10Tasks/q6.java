package ModernJava.Day10Tasks;

// 6. Convert Celsius to Fahrenheit Using Function

import java.util.Scanner;
import java.util.function.Function;

public class q6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        Function<Double, Double> obj = (c) -> {
            return (c * 9 / 5) + 32;
        };

        double fahrenheit = obj.apply(celsius);

        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        sc.close();
    }
}
