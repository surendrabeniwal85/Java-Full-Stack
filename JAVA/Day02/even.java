package JAVA.Day02;

import java.util.Scanner;

public class even {
    public static void main(String[] args){

        int n;
        try (Scanner sc = new Scanner(System.in)){
        System.out.println("Enter your number : ");
        n = sc.nextInt();
        }
        
        while(n <= 100){
            System.out.println("Even numbers are : " +n);
            n = n + 2;
        }
    }  
}

