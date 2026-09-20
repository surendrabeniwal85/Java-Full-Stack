package JAVA.Day04;

//current class instance as a parameter to the method

public class a5 {

    void m1(){
        m2(this); //This keyword will work as argument
        System.out.println("1st method printed");
    }

    void m2(a5 s){ //Reference of object will also print
        System.out.println("2nd method printed " + s);
    }

    void m3(){
        m4(this);
        System.out.println("3rd method printed ");
    }

    void m4(a5 a){
        System.out.println("4th method printed ");
    }

    public static void main(String[] args){
        a5 obj = new a5();
        obj.m1();
        obj.m3();
    }  
}
