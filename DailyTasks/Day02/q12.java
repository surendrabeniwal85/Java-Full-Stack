import java.util.Scanner;

public class q12 {
    static void main(String[] args){

        int n;
        try (Scanner sc = new Scanner(System.in)){
        System.out.println("Enter your number : ");
        n = sc.nextInt();

        if(n % n == 0 && n % 1 == 0){
            System.out.println("The number is prime");
        }else{
            System.out.println("The number is not prime");
        }
        }
    }   
}
