package DailyTasks.Day04;

//Calling Parent Method Using super

class Parent1{
    void display(){
        System.out.println("Hemraj Beniwal");
    }
}

public class q27 extends Parent1 {

    void display(){
        System.out.println("Surendra Beniwal");
    }

    void show(){
        super.display();
        this.display();   
    }

    public static void main(String[] args) {
        q27 obj = new q27();
        obj.show();
    }
    
}
