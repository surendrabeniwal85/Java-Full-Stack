package ModernJava.Day16;

//Record with equals()
record StudentS(int id, String name){
}

public class a16 {
    public static void main(String[] args) {

        StudentS s1 = new StudentS(1218, "Surendra Beniwal");
        StudentS s2 = new StudentS(1846, "Ayush Singh");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
