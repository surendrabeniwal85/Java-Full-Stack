package ModernJava.Day16;

public class a13 {

    record Student(int id, String name, double marks){
    }

    public static void main(String[] args) {
        
        Student s1 = new Student(101, "Surendra Beniwal", 90);

        System.out.println("ID    : " + s1.id());
        System.out.println("Name  : " + s1.name());
        System.out.println("Marks : " + s1.marks());
    }
}
