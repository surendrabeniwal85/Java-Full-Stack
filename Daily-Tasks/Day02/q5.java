import java.util.Scanner;

public class q5 {

    public static void main(String[] args){

        int year;
        try (Scanner sc = new Scanner(System.in)){
        System.out.println("Enter year : ");
        year = sc.nextInt();
        }

        if(year % 4 == 0 && year % 100 == 0){
            System.out.println("This is a leap year");
        }else{
            System.out.println("This is not a leap year");
        }
    }  
}
