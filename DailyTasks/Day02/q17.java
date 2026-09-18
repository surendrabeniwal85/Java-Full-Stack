//count number of digits

import java.util.Scanner;

public class q17 {
    public static void main(String[] args){

        int n;
        int count = 0;

        try(Scanner sc = new Scanner(System.in)){

            System.out.println("Enter a number : ");
            n = sc.nextInt();
        }

        while( n != 0){
            n = n / 10;
            count++;
        }

        System.out.println("Number of digits = " + count);
    }
}
