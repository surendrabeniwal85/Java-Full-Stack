package ModernJava.Day10Tasks;

// 11. Print Student Name Using Consumer

import java.util.Scanner;
import java.util.function.Consumer;

public class q11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        Consumer<String> obj = (n) -> {
            System.out.println("Student Name: " + n);
        };

        obj.accept(name);

        sc.close();
    }
}
