import java.util.Scanner;

public class dowhile {

    public static void main(String[] args){

        int n;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Enter a positive number : ");
            n = sc.nextInt();
        }while(n < 0);
        System.out.println("You entered a valid +ve number : " + n);
        sc.close();
    }
    
}
