package DailyTasks.Day05;

//constructor overloading

class StudentH {

    int id;
    String name;

    StudentH() {
        id = 0;
        name = "Unknown";
    }

    StudentH(int id) {
        this.id = id;
        name = "Unknown";
    }

    StudentH(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println();
    }
}

public class q8 {

    public static void main(String[] args) {

        StudentH student1 = new StudentH();
        StudentH student2 = new StudentH(101);
        StudentH student3 = new StudentH(102, "Surendra");

        student1.display();
        student2.display();
        student3.display();
    }
}
