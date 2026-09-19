package DailyTasks.Day03;

//Multiple objects of a class

class StudentB{
    String name;
    int age;

    void display(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}

public class q2 {
    public static void main(String[] args){
        StudentB s1 = new StudentB();
        s1.name = "Surendra";
        s1.age = 22;

        StudentB s2 = new StudentB();
        s2.name = "Naman";
        s2.age = 23;

        s1.display();
        s2.display();
    }
}
