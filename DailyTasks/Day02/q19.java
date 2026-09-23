package DailyTasks.Day02;

// armstrong number

import java.util.Scanner;

public class q19 {
    public static void main(String[] args) {

        int n;

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter a number : ");
            n = sc.nextInt();
        }

        int original = n;
        int temp = n;
        int count = 0;
        int sum = 0;

        // count digits
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }

        // calculate Armstrong sum
        while (n != 0) {

            int lastDig = n % 10;
            int power = 1;

            for (int i = 1; i <= count; i++) {
                power = power * lastDig;
            }

            sum = sum + power;
            n = n / 10;
        }

        if (sum == original) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("NOT an Armstrong number");
        }
    }
}
