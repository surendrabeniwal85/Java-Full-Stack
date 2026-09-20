package DailyTasks.Day04;

//using this with multiple fields

public class q20 {

    String name;
    int age;
    int marks;

    q20(String name, int age, int marks){
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    void display(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Marks : " + marks);
    }

    public static void main(String[] args){
        q20 student = new q20("Surendra Beniwal", 22, 95);
        student.display();
    }

}
