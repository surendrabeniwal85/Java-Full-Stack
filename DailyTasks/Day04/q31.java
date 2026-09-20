package DailyTasks.Day04;

//Accessing Public Members

class StudentA{
    public String name = "Surendra Beniwal";

    public void display(){
        System.out.println("Name : " + name);
    }
}

public class q31 {

    public static void main(String[] args) {
        StudentA stu = new StudentA();

        System.out.println(stu.name);
        stu.display();
    }  
}
