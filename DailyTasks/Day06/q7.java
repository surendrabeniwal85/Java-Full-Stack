package DailyTasks.Day06;

import java.util.Scanner;

class q7 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            String input = sc.nextLine();

            try {
                int number = Integer.parseInt(input);
                System.out.println("Number = " + number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format.");
            }
        }
    }
}
