package JAVA.Day01Basics;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args){
        System.out.println("Hello, World");
        //var declaration
        int a, b, c;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the value of a : ");
            a = sc.nextInt();
            System.out.println("Enter the value of b : ");
            b = sc.nextInt();
        }
        c = a + b;
        System.out.println("The sum is : " +  c);
        //dynamic value intake
        int d = a * b;
        System.out.println("The product is : " + d);
        int e = a - b;
        System.out.println("The subtraction is : " + e);
        int f = a / b;
        System.out.println("The divide is : " + f);
    }
}
