package DailyTasks.Day02;

//calculator using switch case

import java.util.Scanner;

public class q9{
    public static void main(String[] args){

        double a, b;
        char operator;


        try (Scanner sc = new Scanner(System.in)){

            System.out.println("Enter a : ");
            a = sc.nextDouble();

            System.out.println("Enter operator(+, -, *, /, %) : ");
            operator = sc.next().charAt(0);

            System.out.println("Enter b : ");
            b = sc.nextDouble();

            switch(operator){
                case '+':
                    System.out.println("Result = " +(a+b));
                    break;
                case '-':
                    System.out.println("Result = " +(a-b));
                    break;
                case '*':
                    System.out.println("Result = " +(a*b));
                    break;
                case '/':
                    if(b != 0){
                        System.out.println("Result = " +(a/b));
                    } else{
                        System.out.println("Cannot divide by zero");
                    }
                    break;
                case '%':
                    if(b != 0){
                        System.out.println("Result = " +(a%b));
                    } else{
                        System.out.println("Cannot divide by zero");
                    }
                    break;
                default:
                    System.out.println("Invalid operator"); 
            }
        }
    }
}

