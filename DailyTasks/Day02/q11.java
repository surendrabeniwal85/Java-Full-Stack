//Palindrome number

import java.util.Scanner;

public class q11 {

    public static void main(String[] args){

        int n;
        int original;
        int rev = 0;

        try(Scanner sc = new Scanner(System.in)){

            System.out.println("Enter a number : ");
            n = sc.nextInt();
        }

        original = n;

        while( n != 0){
            int lastDig = n % 10;
            rev = rev * 10 + lastDig;
            n = n / 10;
        }

        if(original == rev){
            System.out.println(original + " is a palindrome number.");
        } else{
            System.out.println(original + " is NOT a palindrome number.");
        }
    }
}
