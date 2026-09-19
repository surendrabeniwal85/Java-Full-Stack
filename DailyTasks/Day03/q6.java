package DailyTasks.Day03;

import java.util.Scanner;

//Calculate rectangle Area using method

class Rectangle{
    double l;
    double b;

    double Area(){
        return l * b;
    }
}

public class q6 {
    public static void main(String[] args){
    Rectangle rect = new Rectangle();

    try(Scanner sc = new Scanner(System.in)){
        System.out.println("Enter length : ");
        rect.l = sc.nextDouble();

        System.out.println("Enter Breadth : ");
        rect.b = sc.nextDouble();
    }

    System.out.println("Area : " + rect.Area());
    }
}
