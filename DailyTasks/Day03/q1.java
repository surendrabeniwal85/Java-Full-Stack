package DailyTasks.Day03;

//Create a basic class and object

class StudentA{
    String name = "Surendra";
    int age = 22;

    void display(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}

public class q1 {
    public static void main(String[] args){
        StudentA s = new StudentA();
        s.display();
    }
}