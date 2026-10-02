package ModernJava.Day10Tasks;

// 4. Check Whether a Number is Divisible by 5 Using Predicate

import java.util.Scanner;
import java.util.function.Predicate;

public class q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Number: ");
        int n = sc.nextInt();

        Predicate<Integer> obj = (num) -> {
            return num % 5 == 0;
        };

        if (obj.test(n)) {
            System.out.println(n + " is divisible by 5");
        } else {
            System.out.println(n + " is not divisible by 5");
        }

        sc.close();
    }
}
