package DailyTasks.Day06;

import java.util.Scanner;

class q5 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] numbers = {10, 20, 30, 40, 50};

            System.out.print("Enter index: ");
            int index = sc.nextInt();

            try {
                System.out.println("Element = " + numbers[index]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid index.");
            }
        }
    }
}
