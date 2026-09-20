package DailyTasks.Day04;

//Difference Between this and super

class Parent4 {
    String name = "Hemraj Beniwal";
}

public class q30 extends Parent4 {

    String name = "Surendra Beniwal";

    void show() {
        System.out.println("Child Name : " + this.name);
        System.out.println("Parent Name : " + super.name);
    }

    public static void main(String[] args) {
        q30 obj = new q30();
        obj.show();
    }
}
