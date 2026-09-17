import java.util.Scanner;

public class test4 {
    public static void main(String[] args){

        int age;
        try (Scanner sc = new Scanner(System.in)){
        System.out.println("Enter your Age : ");
        age = sc.nextInt();
        }

        if(age >= 18 && age <= 60){
            System.out.println("Congratulations! You are eligible to vote.");
        }else{
            System.out.println("Oops! You are not eligible to vote.");
        }
    }
}
