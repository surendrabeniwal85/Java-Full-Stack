package DailyTasks.Day04;

// Calling Parent Constructor Using super()

class Parent2{
    Parent2(){
        System.out.println("Hemraj Beniwal");
    }
}

public class q28 extends Parent2 {

    q28(){
        super();
        System.out.println("Surendra Beniwal");
    }

    public static void main(String[] args) {
        new q28();
    }
    
}
