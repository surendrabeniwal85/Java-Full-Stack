package DailyTasks.Day03;

//Constructor and method example

class StudentS{
    String name;
    int age;

    StudentS(String name, int age){
        this.name = name;
        this.age = age;
    }

    void display(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}

public class q16 {
    public static void main(String[] args){
        StudentS  s = new StudentS("Surendra Beniwal", 22);

        s.display();
    }  
}
