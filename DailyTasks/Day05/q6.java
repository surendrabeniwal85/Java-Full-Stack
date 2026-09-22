package DailyTasks.Day05;

//super keyword

class ParentF {

    String name = "Parent";

    void display() {
        System.out.println("Parent display method");
    }
}

class ChildF extends ParentF {

    String name = "Child";

    void display() {
        System.out.println("Child display method");
    }

    void show() {

        System.out.println("Child name: " + name);
        System.out.println("Parent name: " + super.name);

        display();
        super.display();
    }
}

public class q6 {

    public static void main(String[] args) {

        ChildF child = new ChildF();

        child.show();
    }
}
