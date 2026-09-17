import java.util.Scanner;

public class q7 {
    public static void main(String[] args){

        int n;
        try (Scanner sc = new Scanner(System.in)){
        System.out.println("Enter your number : ");
        n = sc.nextInt();
        }

        for(int i = 1; i <= 10; i++){
            n = i * n;
            System.out.println(+ n);
        }
    } 
}
