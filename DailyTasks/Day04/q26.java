package DailyTasks.Day04;

//Access Parent Variable Using super

class Parent{
    String name = "Hemraj Beniwal";

}

public class q26 extends Parent {

    String name = "Surendra Beniwal";

    void display(){
        System.out.println("Child Name : " + this.name);
        System.out.println("Parent Name : " + super.name);
    }

    public static void main(String[] args) {
        q26 obj = new q26();
        obj.display();
    }
    
}
