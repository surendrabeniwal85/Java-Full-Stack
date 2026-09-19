package DailyTasks.Day03;

import java.util.Scanner;

//Calculate circle Area and Circumference

class Circle{
    double r;

    double Area(){
        return Math.PI * r * r;
    }

    double Circumference(){
        return 2 * Math.PI * r;
    }

}

public class q7 {
    public static void main(String[] args){
        Circle c = new Circle();

        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter Radius : ");
            c.r = sc.nextDouble();
        }

        System.out.println("Area of circle is : " + c.Area());
        System.out.println("Circumference of circle is : " + c.Circumference());
    }
}
