package DailyTasks.Day02;

//get user input

import java.util.Scanner;

public class q1 {
    static void main(String[] args){

        try (Scanner sc = new Scanner(System.in)){
        System.out.println("Enter your name : ");
        String  name = sc.nextLine();
        
        System.out.println("Enter your age : ");
        int age = sc.nextInt();

        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        }
    }
}

