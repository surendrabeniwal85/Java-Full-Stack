import java.util.Scanner;

public class q2 {
    static void main(String[] args){

        int a, b;
        try (Scanner sc = new Scanner(System.in)){
        System.out.println("Enter a : ");
        a = sc.nextInt();
        System.out.println("Enter b : ");
        b = sc.nextInt();

        if(a > b){
            System.out.println("A is greater");
        }else{
            System.out.println("B is greater");
        }
        }
    }
    
}
