package ModernJava.Day16;

import java.util.List;

//Record with collection

record StudentB(int id, String name){
}

public class a17 {
    public static void main(String[] args) {

        List<StudentB> students = List.of(
                new StudentB(1218, "Surendra Beniwal"),   
                new StudentB(1846, "Ayush Singh"),
                new StudentB(2122, "Pulkit Khandelwal"));

        for(StudentB s : students){
                System.out.println(s.id() + " : " + s.name());
        }  
    } 
}
