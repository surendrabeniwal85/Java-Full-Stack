package DailyTasks.Day02;

//LCM of two numbers

import java.util.Scanner;

public class q16 {
    public static void main(String[] args){

        int a, b;

        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter a : ");
            a = sc.nextInt();

            System.out.println("Enter b : ");
            b = sc.nextInt();
        }

        int lcm = 1;

        while(lcm % a != 0 || lcm % b != 0){
            lcm++;
        }
        System.out.println("LCM of a and b = " + lcm);
    }
}
