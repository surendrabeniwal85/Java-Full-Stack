package DailyTasks.Day06;

import java.util.Scanner;

class q9 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter age: ");
            int age = sc.nextInt();

            try {
                if (age < 18) {
                    throw new ArithmeticException("Person is below 18.");
                }

                System.out.println("Person is eligible.");
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
