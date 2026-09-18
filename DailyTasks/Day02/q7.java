//factorial of a number

import java.util.Scanner;

public class q7 {
    public static void main(String[] args){

        int n;
        try (Scanner sc = new Scanner(System.in)){
        System.out.println("Enter your number : ");
        n = sc.nextInt();
        }

        long fact = 1;
        for(int i = 1; i <= n; i++){
            fact = fact * i;
        }

        System.out.println("Factorial of " + n + " = " + fact);
    } 
}
