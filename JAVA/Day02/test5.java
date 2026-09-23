package JAVA.Day02;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args){

        var id = "admin";
        var password = "surendra";

        String i,p;

        try (Scanner sc = new Scanner(System.in)){
        System.out.println("Enter your Id : ");
        i = sc.nextLine();
        System.out.println("Enter your Password : ");
        p = sc.nextLine();
        }

        if(id.equals(i) && password.equals(p)){
            System.out.println("Congrats! Login successful.");
        } else{
            System.out.println("Try Again! Login failed.");
        } 
    } 
}

