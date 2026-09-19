package DailyTasks.Day03;

//Multiple constructors in a class

class StudentE{
    String name;
    int age;

    StudentE(){
        name = "Unknown";
        age = 0;
    }

    StudentE(String name){
        this.name = name;
        age = 0;
    }

    StudentE(String name, int age){
        this.name = name;
        this.age = age;
    }

    void display(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println();
    }
    
}


public class q14 {
    public static void main(String[] args){
        StudentE s1 = new StudentE();

        StudentE s2 = new StudentE("Surendra Beniwal");

        StudentE s3 = new StudentE("Surendra Beniwal", 22);

        s1.display();
        s2.display();
        s3.display();
    } 
}
