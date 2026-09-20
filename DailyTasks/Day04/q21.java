package DailyTasks.Day04;

//Constructor chaining using this()

public class q21 {

    String name;
    int age;

    q21(){
        this("Surendra Beniwal", 22);
    }

    q21(String name, int age){
        this.name = name;
        this.age = age;
    }

    void display(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }

    public static void main(String[] args){
        q21 student = new q21();
        student.display();
    }
    
}
