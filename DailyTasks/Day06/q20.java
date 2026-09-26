package DailyTasks.Day06;

import java.util.Scanner;

class q20 {

    static void withdraw(double balance, double amount)
            throws InsufficientBalanceException {

        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }

        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance.");
        }

        System.out.println("Withdrawal successful.");
        System.out.println("Remaining balance = " + (balance - amount));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 10000;

        try {
            System.out.print("Enter deposit amount: ");
            double deposit = sc.nextDouble();

            if (deposit < 0) {
                throw new IllegalArgumentException("Deposit cannot be negative.");
            }

            balance = balance + deposit;

            System.out.println("Deposit successful.");
            System.out.println("Current balance = " + balance);

            System.out.print("Enter withdrawal amount: ");
            double withdrawal = sc.nextDouble();

            withdraw(balance, withdrawal);

        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Banking operation completed.");
        }
    }
}
