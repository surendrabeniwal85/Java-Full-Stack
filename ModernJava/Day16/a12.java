package ModernJava.Day16;

public class a12 {
    public static void main(String[] args) {
        
        String name = "Surendra Beniwal";
        int marks = 85;
        String course = "B.Tech";

        String report = """
                ===================
                  STUDENT REPORT
                ===================
                Name   : %s
                Course : %s
                Marks  : %d
                Result : PASS
                ===================
                """.formatted(name, course, marks);

        System.out.println(report);
    }
}
