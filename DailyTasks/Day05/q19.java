package DailyTasks.Day05;

//Interface-Based Polymorphism

interface ShapeS {

    void draw();
}

class CircleS implements ShapeS {

    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class RectangleS implements ShapeS {

    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

public class q19 {

    public static void main(String[] args) {

        ShapeS shape;

        shape = new CircleS();
        shape.draw();

        shape = new RectangleS();
        shape.draw();
    }
}
