//swap two numbers

import java.util.Scanner;

public class q8 {
    public static void main(String[] args){

        int a , b;

        try(Scanner sc = new Scanner(System.in)){

            System.out.println("Enter first num : ");
            a = sc.nextInt();

            System.out.println("Enter second num : ");
            b = sc.nextInt();

            //using third variable

            System.out.println("---Using third variable---");
            System.out.println("Before swapping : ");
            System.out.println("a = " + a);
            System.out.println("b = " + b);

            int temp = a;
            a = b;
            b = temp;

            System.out.println("After swapping : ");
            System.out.println("a = " + a);
            System.out.println("b = " + b);

            //Without using third variable

            System.out.println("---Without Using third variable---");
            System.out.println("Before swapping : ");
            System.out.println("a = " + a);
            System.out.println("b = " + b);

            a = a + b;
            b = a - b;
            a = a - b;

            System.out.println("After swapping : ");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
    }
}



