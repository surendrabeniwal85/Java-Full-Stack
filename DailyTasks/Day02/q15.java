//GCD or HCF of two numbers

import java.util.Scanner;

public class q15 {
    public static void main(String[] args){

        int a, b;

        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter a : ");
            a = sc.nextInt();

            System.out.println("Enter b : ");
            b = sc.nextInt();
        }

        while(b != 0){
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        System.out.println("GCD of a & b = " + a);
    }
}
