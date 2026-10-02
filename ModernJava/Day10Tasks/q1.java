package ModernJava.Day10Tasks;

// 1. Check Whether a Number is Even Using Lambda Expression

import java.util.Scanner;

interface Even{
    public void check(int num);
}

public class q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
            System.out.print("Enter your Number : ");
            int n = sc.nextInt();
        
            Even obj = (num) -> {
                if(num % 2 == 0){
                    System.out.println(n + " is even number");
                } else {
                    System.out.println(n + " is odd number");
                }
            };
            obj.check(n);
            sc.close();
    }
}
