package ModernJava.Day16;

interface Printable{
    void print();
}

record Student(int id, String name) implements Printable{

    @Override 
    public void print(){
        System.out.println(id + " : " + name);
    }
}

public class a15 {
    public static void main(String[] args) {
        
        Student s = new Student(101, "Surendra Beniwal");
        s.print();
    }
}
