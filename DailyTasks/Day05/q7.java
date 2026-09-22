package DailyTasks.Day05;

//method overloading

class CalculatorG {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class q7 {

    public static void main(String[] args) {

        CalculatorG calculator = new CalculatorG();

        System.out.println("Sum of 2 numbers: " + calculator.add(10, 20));

        System.out.println("Sum of 3 numbers: "
                + calculator.add(10, 20, 30));

        System.out.println("Sum of decimal numbers: "
                + calculator.add(10.5, 20.5));
    }
}
