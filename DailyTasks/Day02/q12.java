package DailyTasks.Day02;

//prime or not

import java.util.Scanner;

public class q12 {
    public static void main(String[] args){

        int n;
        boolean prime = true;

        try (Scanner sc = new Scanner(System.in)){
        System.out.println("Enter your number : ");
        n = sc.nextInt();
        }

        if(n <= 1){
            prime = false;
        } else{
            for(int i = 2; i <= n / 2; i++){
                if(n % i == 0){
                    prime = false;
                    break;
                }
            }
        }

        if(prime){
            System.out.println(n + " is prime");
        }else{
            System.out.println(n + " is NOT prime");
        }
    }   
}

