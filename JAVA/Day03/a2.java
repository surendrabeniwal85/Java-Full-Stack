package JAVA.Day03;

class StudentB{
    String name;
    int roll_no;

    StudentB(String name, int roll_no){
        this.name = name;
        this.roll_no = roll_no;
    }

    void display(){
        System.out.println("Name : " + this.name);
        System.out.println("Roll Number : " + this.roll_no);
    }
}

public class a2 {
    public static void main(String[] args){
        StudentB obj = new StudentB("Surendra" , 22);
        obj.display();

        StudentB obj2 = new StudentB("Naman" , 23);
        obj2.display();
    }
}
