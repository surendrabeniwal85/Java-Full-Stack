package ModernJava.Day10Tasks;

// 3. Check Voting Eligibility Using Predicate

import java.util.Scanner;
import java.util.function.Predicate;

public class q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        Predicate<Integer> obj = (a) -> {
            return a >= 18;
        };

        if (obj.test(age)) {
            System.out.println("Eligible for voting");
        } else {
            System.out.println("Not eligible for voting");
        }

        sc.close();
    }
}
