package DailyTasks.Day05;

//basic interface

interface ShapeN {

    void area();
}

class CircleN implements ShapeN {

    double radius = 5;

    @Override
    public void area() {

        double result = Math.PI * radius * radius;

        System.out.println("Area of Circle: " + result);
    }
}

public class q14 {

    public static void main(String[] args) {

        CircleN circle = new CircleN();

        circle.area();
    }
}
