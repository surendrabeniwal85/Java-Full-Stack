package DailyTasks.Day02;

//largest of two numbers

import java.util.Scanner;

public class q2 {
    public static void main(String[] args){

        int a, b;
        try (Scanner sc = new Scanner(System.in)){
        System.out.println("Enter a : ");
        a = sc.nextInt();
        System.out.println("Enter b : ");
        b = sc.nextInt();

        if(a > b){
            System.out.println(a + " is largest");
        }else if(b > a){
            System.out.println(b + " is largest");
        }else{
            System.out.println("Both numbers are equal");
        }
        }
    }
    
}

