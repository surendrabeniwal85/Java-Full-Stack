package ModernJava.Day10Tasks;

// 5. Check Whether a String Contains More Than 5 Characters Using Predicate

import java.util.Scanner;
import java.util.function.Predicate;

public class q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        Predicate<String> obj = (s) -> {
            return s.length() > 5;
        };

        if (obj.test(str)) {
            System.out.println("String contains more than 5 characters");
        } else {
            System.out.println("String does not contain more than 5 characters");
        }

        sc.close();
    }
}
