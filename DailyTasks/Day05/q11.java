package DailyTasks.Day05;

//abstract class

abstract class ShapeK {

    abstract void calculateArea();
}

class CircleK extends ShapeK {

    double radius = 5;

    @Override
    void calculateArea() {

        double area = Math.PI * radius * radius;

        System.out.println("Area of Circle: " + area);
    }
}

public class q11 {

    public static void main(String[] args) {

        CircleK circle = new CircleK();

        circle.calculateArea();
    }
}
