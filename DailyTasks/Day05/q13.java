package DailyTasks.Day05;

//abstract class + polymorphism

abstract class ShapeM {

    abstract void calculateArea();
}

class CircleM extends ShapeM {

    double radius = 5;

    @Override
    void calculateArea() {

        double area = Math.PI * radius * radius;

        System.out.println("Circle Area: " + area);
    }
}

class RectangleM extends ShapeM {

    double length = 10;
    double width = 5;

    @Override
    void calculateArea() {

        double area = length * width;

        System.out.println("Rectangle Area: " + area);
    }
}

public class q13 {

    public static void main(String[] args) {

        ShapeM shape;

        shape = new CircleM();
        shape.calculateArea();

        shape = new RectangleM();
        shape.calculateArea();
    }
}
