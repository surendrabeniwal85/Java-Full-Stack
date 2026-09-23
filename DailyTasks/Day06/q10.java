package DailyTasks.Day06;

import java.util.Scanner;

class q10 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter marks: ");
            int marks = sc.nextInt();

            try {
                if (marks < 0 || marks > 100) {
                    throw new IllegalArgumentException("Marks must be between 0 and 100.");
                }

                System.out.println("Valid marks = " + marks);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
