package ModernJava.Day10Tasks;

// 14. Calculate and Display Product Price After Discount Using Consumer

import java.util.Scanner;
import java.util.function.Consumer;

public class q14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Product Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Discount Percentage: ");
        double discount = sc.nextDouble();

        double finalPrice = price - (price * discount / 100);

        Consumer<Double> obj = (p) -> {
            System.out.println("Price after discount: " + p);
        };

        obj.accept(finalPrice);

        sc.close();
    }
}