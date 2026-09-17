import java.util.Scanner;

public class test5 {
    static void main(String[] args){

        var id = "admin";
        var password = "surendra";

        String i,p;
        try (Scanner sc = new Scanner(System.in)){
        System.out.println("Enter your Id : ");
        i = sc.nextLine();
        System.out.println("Enter your Password: ");
        p = sc.nextLine();
        }

        try (Scanner sc = new Scanner(System.in)){
        }

        if(id && password == true){
            System.out.println("Login successful");
        } else{
            System.out.println("Login failed");
        } 
    } 
}
