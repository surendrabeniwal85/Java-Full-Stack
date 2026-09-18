//fibonacci series

import java.util.Scanner;

public class q14 {
    public static void main(String[] args){

        int n;

        try(Scanner sc = new Scanner(System.in)){

            System.out.println("Enter number of terms : ");
            n = sc.nextInt();
        }

        int a = 0;
        int b = 1;

        System.out.println("Fibonacci Series : ");

        for(int i = 1; i <= n; i++){
            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }
    }  
}
