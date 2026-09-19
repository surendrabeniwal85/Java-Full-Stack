package JAVA.Day03;

//parameterized constructor

public class a8 {

    int rollno;
    String name;

    a8(int r, String n){
        rollno = r;
        name = n;
    }

    public void display(){

        System.out.println("Roll Number : " + rollno);
        System.out.println("Name : " + name);
    }

    public static void main(String[] args){

        a8 obj1 = new a8(100, "Surendra");
        obj1.display();

        a8 obj2 = new a8(200, "Naman");
        obj2.display();
    }
}
