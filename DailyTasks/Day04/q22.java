package DailyTasks.Day04;

// Parameterized Constructor Chaining Using this()

public class q22 {

    String name;
    int age;

    q22(){
        this("Surendra Beniwal");
    }

    q22(String name){
        this(name, 22);
    }

    q22(String name, int age){
        this.name = name;
        this.age = age;
    }

    void display(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }

    public static void main(String[] args){
        q22 student = new q22();
        student.display();
    }
    
}
