package ModernJava.Day16;

public class a14 {

    record Student(int id, String name, double marks){

        public boolean isPassed(){
            return marks >= 40;
        }
    }

    public static void main(String[] args) {
        
        Student s = new Student(101, "Surendra Beniwal", 85);

        System.out.println(s.name());
        System.out.println(s.isPassed());
    }
}
