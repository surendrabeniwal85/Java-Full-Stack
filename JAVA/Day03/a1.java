package JAVA.Day03;

class StudentA{
    String name;
    int roll_no;

    StudentA(String name, int roll_no){
        this.name = name;
        this.roll_no = roll_no;
    }

    void display(){
        System.out.println("Name : " + this.name);
        System.out.println("Roll Number : " + this.roll_no);
    }
}

public class a1 {
    public static void main(String[] args){
        StudentA obj = new StudentA("Surendra" , 22);
        obj.display();
    }
}
