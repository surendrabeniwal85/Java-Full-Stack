package DailyTasks.Day03;

//Student information using fields and methods

class StudentC{
    String name;
    int rollNo;
    String course;

    void displayInfo(){
        System.out.println("Name : " + name);
        System.out.println("Roll Number : " + rollNo);
        System.out.println("Course : " + course);
    }
}

public class q3 {
    public static void main(String[] args){
        StudentC s1 = new StudentC();
        s1.name = "Surendra";
        s1.rollNo = 1218;
        s1.course = "B.Tech CSE";

        s1.displayInfo();
    }
}

