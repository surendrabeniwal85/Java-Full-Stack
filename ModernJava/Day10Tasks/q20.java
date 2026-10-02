package ModernJava.Day10Tasks;

// 20. Student Result Processing System Using Predicate, Function, Consumer and Supplier

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class q20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        String[] subjects = new String[5];
        int[] marks = new int[5];

        int total = 0;

        // Taking input for 5 subjects
        for (int i = 0; i < 5; i++) {

            System.out.print("\nEnter Subject " + (i + 1) + " Name: ");
            subjects[i] = sc.nextLine();

            System.out.print("Enter " + subjects[i] + " Marks: ");
            marks[i] = sc.nextInt();

            total = total + marks[i];

            sc.nextLine();
        }

        // Predicate - checks whether marks are passing
        Predicate<Integer> checkPass = (m) -> {
            return m >= 40;
        };

        // Function - calculates percentage
        Function<Integer, Double> calculatePercentage = (t) -> {
            return t / 5.0;
        };

        // Consumer - displays information
        Consumer<String> display = (result) -> {
            System.out.println(result);
        };

        // Supplier - generates result heading
        Supplier<String> message = () -> {
            return "===== STUDENT RESULT =====";
        };

        System.out.println();

        display.accept(message.get());

        display.accept("Student Name: " + name);

        System.out.println("\nSubject-wise Marks:");

        for (int i = 0; i < 5; i++) {
            display.accept(subjects[i] + ": " + marks[i]);
        }

        display.accept("\nTotal Marks: " + total + "/500");

        double percentage = calculatePercentage.apply(total);

        display.accept("Percentage: " + percentage + "%");

        // Checking each subject
        boolean allPass = true;

        for (int i = 0; i < 5; i++) {

            if (!checkPass.test(marks[i])) {
                allPass = false;
                break;
            }
        }

        if (allPass) {
            display.accept("Status: Pass");
        } else {
            display.accept("Status: Fail");
        }

        sc.close();
    }
}