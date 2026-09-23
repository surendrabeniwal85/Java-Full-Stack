package DailyTasks.Day06;

import java.util.Scanner;

class q2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] numbers = {10, 20, 30};

            System.out.print("Enter denominator: ");
            int denominator = sc.nextInt();

            System.out.print("Enter array index: ");
            int index = sc.nextInt();

            try {
                System.out.println("Division = " + (100 / denominator));
                System.out.println("Array element = " + numbers[index]);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero.");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array index.");
            }
        }
    }
}
