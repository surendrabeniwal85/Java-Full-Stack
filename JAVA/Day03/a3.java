package JAVA.Day03;

class Student{
    String name;
    int rollNo;
    int marks;
    String course;

void display(){
    System.out.println("Name : " + name);
    System.out.println("Roll Number : " + rollNo);
    System.out.println("Marks : " + marks);
    System.out.println("Course : " + course);
    System.out.println();
}

}

public class a3 {
    public static void main(String[] args){
        Student obj1 = new Student();
        obj1.name = "Surendra";
        obj1.rollNo = 20;
        obj1.marks = 89;
        obj1.course = "BTech";

        Student obj2 = new Student();
        obj2.name = "Ayush";
        obj2.rollNo = 21;
        obj2.marks = 96;
        obj2.course = "BCA";

        Student obj3 = new Student();
        obj3.name = "Naman";
        obj3.rollNo = 22;
        obj3.marks = 83;
        obj3.course = "MTech";

        Student obj4 = new Student();
        obj4.name = "Pulkit";
        obj4.rollNo = 23;
        obj4.marks = 78;
        obj4.course = "BSc";

        obj1.display();
        obj2.display();
        obj3.display();
        obj4.display();
    }
}
