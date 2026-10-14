package ModernJava.Day16;

import java.util.List;

//Record with collection

record Student(int id, String name){
}

public class a17 {
    public static void main(String[] args) {

        List<Student> students = List.of(
                new Student(1218, "Surendra Beniwal"),   
                new Student(1846, "Ayush Singh"),
                new Student(2122, "Pulkit Khandelwal"));

        for(Student s : students){
                System.out.println(s.id() + " : " + s.name());
        }  
    } 
}
