package ModernJava.Day17;

public class a03 {
    public static void main(String[] args) {
        CollegeC col = new CollegeC("JECRC", "Jagatpura");
        StudentS s1 = new StudentS(22, "Rahul", col);
        // 2nd part
        s1.getCollege().name = "Poonima University";
        System.out.println(s1.getCollege().name);
        //System.out.println(s1);
        // System.out.println(s1.getAge());
        // System.out.println(s1.getName());
        // System.out.println(s1.getCollege());
        System.out.println("---Mutable---");
        // College col = new College("JECRC", "Shri Ram ki Nangal");
        // System.out.println(col);
        System.out.println(col.name = "JU");
    }
}

// Immutable Class
// defensive copy of college - NOn Premitive
class StudentS {
    private int age;
    private String name;
    private CollegeC college;

    StudentS(int age, String name, CollegeC college) {
        this.age = age;
        this.name = name;
        this.college = new CollegeC(college.name, college.Address);
    }

    // Getters
    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public CollegeC getCollege() {
        return new CollegeC(this.college.name, this.college.Address);
    }
}

// class AIstudents extends Student {

// }

class CollegeC {
    String name;
    String Address;

    CollegeC(String name, String Address) {
        this.name = name;
        this.Address = Address;
    }
}
