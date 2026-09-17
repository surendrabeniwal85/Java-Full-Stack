import java.util.Scanner;

public class test2 {
    static void main(String[] args){

        int marks;
        try (Scanner sc = new Scanner(System.in)){
        System.out.println("Enter your Marks : ");
        marks = sc.nextInt();
        }

        if(marks >= 90){
            System.out.println("Grade: A");
        }else if(marks >= 75){
            System.out.println("Grade: B");
        }else if(marks >= 50){
            System.out.println("Grade: C");
        }else{
            System.out.println("Grade: F");
        } 
    } 
}
