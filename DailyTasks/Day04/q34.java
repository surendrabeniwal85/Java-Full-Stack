package DailyTasks.Day04;

//Accessing Default Members

class StudentE {

    String name = "Surendra";

    void display() {
        System.out.println("Name: " + name);
    }
}

public class q34 {

    public static void main(String[] args) {
        StudentE student = new StudentE();

        System.out.println(student.name);
        student.display();
    }
}
