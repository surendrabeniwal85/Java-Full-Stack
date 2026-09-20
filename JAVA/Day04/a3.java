package JAVA.Day04;

//this keyword for current class method

public class a3 {

    void m1(){
        System.out.println("M1 Initialized");
        this.m2();
    }

    void m2(){
        System.out.println("M2 Initialized");
    }

    public static void main(String[] args){
        a3 obj = new a3();
        obj.m1();
    }
}
