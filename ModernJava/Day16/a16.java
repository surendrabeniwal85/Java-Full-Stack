package ModernJava.Day16;

//Record with equals()
record Student(int id, String name){
}

public class a16 {
    public static void main(String[] args) {

        Student s1 = new Student(1218, "Surendra Beniwal");
        Student s2 = new Student(1846, "Ayush Singh");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
