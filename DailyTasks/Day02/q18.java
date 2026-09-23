package DailyTasks.Day02;

//sum of digits

import java.util.Scanner;

public class q18 {
    public static void main(String[] args){

        int n;
        int sum = 0;

        try(Scanner sc = new Scanner(System.in)){

            System.out.println("Enter a number : ");
            n = sc.nextInt();
        }

        while(n != 0){
            int lastDig = n % 10;
            sum = sum + lastDig;
            n = n / 10;
        }

        System.out.println("Sum of digits = " + sum);
    }
}

