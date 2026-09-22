package JAVA.Day05;

import java.util.Scanner;

//abstract class

abstract class Fan{
    abstract void turnOn();

    abstract void turnOff();
}

class FanSwitch extends Fan{
    @Override 
    void turnOn(){
        System.out.println("Fan is On");
    }

    @Override 
    void turnOff(){
        System.out.println("Fan is off");
    }

}

public class a12 {
    public static void main(String[] args) {
        FanSwitch obj = new FanSwitch();

        int n;
        try(Scanner sc = new Scanner(System.in)){
            System.err.println("---Enter your choice---");
            System.out.println("Press 1 for On the Fan");
            System.out.println("Press 2 for Off the Fan");
            System.out.println("Press 3 for exit");
            n = sc.nextInt();
        }

        switch(n){
            case 1:
                obj.turnOn();
                break;
            case 2:
                obj.turnOff();
                break;
            case 3:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
