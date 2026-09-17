package JAVA.Day01Basics;

import java.util.Scanner;

public class atm{

    public static void main(String[] args){

        int balance = 10000;
        int deposit, withdraw;
        int choice;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("---Enter your choice---");
            System.out.println("Press 1 for balance");
            System.out.println("Press 2 for Deposit");
            System.out.println("Press 3 for Withdraw");
            System.out.println("Press 4 for exit");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Your current balance is : " + balance);
                    break;
                case 2:
                    System.out.println("Enter your deposit amount : ");
                    deposit = sc.nextInt();
                    if(deposit > 0){
                        balance = balance + deposit;

                        System.out.println("Your current balance is : " + balance);
                    } else{
                        System.out.println("Enter correct deposit amount");
                    }
                    break;
                case 3:
                    System.out.println("Enter Withdraw Amount: ");
                    withdraw = sc.nextInt();
                    if(balance > withdraw && withdraw > 0){
                        balance = balance - withdraw;
                        System.out.println("Your Current Balance is : " + balance);
                    } else{
                        System.out.println("Enter correct Denomination");
                    }
                    break;
                case 4:
                    System.out.println("THANKYOU FOR CHOOSING US...");
                    break;
                default:
                    System.out.println("Enter a valid choice!");
            }  
        }
        while (choice != 4);
        sc.close();
    }
}
