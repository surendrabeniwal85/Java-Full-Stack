//reverse a number

import java.util.Scanner;

public class q10 {
    
    public static void main(String[] args){

        int n;
        int rev = 0;

        try(Scanner sc = new Scanner(System.in)){

            System.out.println("Enter a number : ");
            n = sc.nextInt();
        }

        while(n != 0){
            int lastDig = n % 10;
            rev = rev * 10 + lastDig;
            n = n / 10;
        }

        System.out.println("Reversed Number is : " + rev);
    }
}
