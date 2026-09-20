package DailyTasks.Day04;

//Calling Parameterized Parent Constructor Using super()

class Parent3{
    Parent3(String name){
        System.out.println("Parent Name : " + name);
    }
}

public class q29 extends Parent3 {

    q29(String name){
        super(name);
        System.out.println("Surendra Beniwal");
    }

    public static void main(String[] args) {
        new q29("Hemraj Beniwal");
    }
    
}