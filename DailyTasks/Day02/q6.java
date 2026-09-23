package DailyTasks.Day02;

//multiplication table

import java.util.Scanner;

public class q6 {
    static void main(String[] args){

        int n;
        try (Scanner sc = new Scanner(System.in)){
        System.out.println("Enter your number : ");
        n = sc.nextInt();
        }

        for(int i = 1; i <= 10; i++){
            int num = i * n;

        System.out.println(n + " * " + i + " = " + num);
        }  
    }  
}

