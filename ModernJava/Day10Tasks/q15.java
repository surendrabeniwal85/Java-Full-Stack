package ModernJava.Day10Tasks;

// 15. Display Pass or Fail Status Using Consumer

import java.util.Scanner;
import java.util.function.Consumer;

public class q15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        Consumer<Integer> obj = (m) -> {
            if (m >= 40) {
                System.out.println("Status: Pass");
            } else {
                System.out.println("Status: Fail");
            }
        };

        obj.accept(marks);

        sc.close();
    }
}
