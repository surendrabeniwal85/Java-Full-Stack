package ModernJava.Day10Tasks;

// 10. Find Length of a String Using Function

import java.util.Scanner;
import java.util.function.Function;

public class q10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        Function<String, Integer> obj = (s) -> {
            return s.length();
        };

        System.out.println("Length of String: " + obj.apply(str));

        sc.close();
    }
}
