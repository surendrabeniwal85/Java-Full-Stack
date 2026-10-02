package ModernJava.Day10;

//Check even number

import java.util.Scanner;

interface Even{
    public void check(int num);
}

public class a5 {
    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter your Number : ");
            int n = sc.nextInt();
        
            Even obj = (num) -> {
                if(n % 2 == 0){
                    System.out.println(n + " is even number");
                } else {
                    System.out.println(n + " is odd number");
                }
            };
            obj.check(n);
        }
    }
}

