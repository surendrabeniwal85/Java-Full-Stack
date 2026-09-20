package JAVA.Day04;

public class a2 {

    int rollNo;
    String name;

    a2(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }

    void display(){
        System.out.println("Name : " + name);
        System.out.println("Roll Number : " + rollNo);
    }

    public static void main(String[] args){
        a2 obj = new a2(1218, "Surendra Beniwal");
        obj.display();
    } 
}
