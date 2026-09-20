package JAVA.Day04;

//current class instance as a parameter to the constructor

public class a6 {
    int rollNo;
    String name;

    a6(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }

    void display(a6 obj){
        System.out.println("Name : " + name);
        System.out.println("Roll Number : " + rollNo);
    }

    void show(){
        display(this); //Passing current object as parameter
    }

    public static void main(String[] args){
        a6 obj = new a6(1218, "Surendra Beniwal");
        obj.show();
    }
}
