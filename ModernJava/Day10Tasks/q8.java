package ModernJava.Day10Tasks;

// 8. Convert a String to Uppercase Using Function

import java.util.Scanner;
import java.util.function.Function;

public class q8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        Function<String, String> obj = (s) -> {
            return s.toUpperCase();
        };

        System.out.println("Uppercase String: " + obj.apply(str));

        sc.close();
    }
}
