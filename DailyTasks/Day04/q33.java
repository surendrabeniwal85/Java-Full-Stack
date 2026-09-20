package DailyTasks.Day04;

//Accessing Protected Members

class ParentA{
    protected String name = "Surendra Beniwal";

    protected void display(){
        System.out.println("Name : " + name);
    }
}

public class q33 extends ParentA {

    public static void main(String[] args) {
        q33 obj = new q33();

        System.out.println(obj.name);
        obj.display();
    }   
}
