import java.util.Scanner;

public class q3 {

     static void main(String[] args){

     int a, b, c;
        try (Scanner sc = new Scanner(System.in)){
        System.out.println("Enter a : ");
        a = sc.nextInt();
        System.out.println("Enter b : ");
        b = sc.nextInt();
        System.out.println("Enter c : ");
        c = sc.nextInt();

        if(a > b && a > c){
            System.out.println("A is greatest");
        }else if(b > a && b > c){
            System.out.println("B is greatest");
        }else{
            System.out.println("C is greatest");
        }
        }
    }
}
