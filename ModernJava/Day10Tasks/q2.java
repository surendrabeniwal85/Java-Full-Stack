package ModernJava.Day10Tasks;

// 2. Check Whether a Number is Positive Using Predicate

import java.util.Scanner;
import java.util.function.Predicate;

public class q2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int n = sc.nextInt();

        Predicate<Integer> obj = (num) -> {
            return num > 0; 
        };

        if(obj.test(n)){
            System.out.println(n + " is a positive number");
        } else{
            System.out.println(n + " is not a positive number");
        }

        sc.close();
    }
}
