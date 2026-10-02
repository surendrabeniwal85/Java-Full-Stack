package ModernJava.Day10Tasks;

// 7. Find Square of a Number Using Function

import java.util.Scanner;
import java.util.function.Function;

public class q7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Number: ");
        int n = sc.nextInt();

        Function<Integer, Integer> obj = (num) -> {
            return num * num;
        };

        System.out.println("Square: " + obj.apply(n));

        sc.close();
    }
}
