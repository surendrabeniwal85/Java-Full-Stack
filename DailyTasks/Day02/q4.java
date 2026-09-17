import java.util.Scanner;

public class q4 {
    public static void main(String[] args){

        int n;
        try (Scanner sc = new Scanner(System.in)){
        System.out.println("Enter your number : ");
        n = sc.nextInt();
        }

        if(n % 2 == 0){
            System.out.println("The number is even");
        }else{
            System.out.println("The number is odd");
        }
    }
}
