package JAVA.Day04;

//this with current class constructor

public class a4 {

    a4(){
        this(41);
        System.out.println("Constructor 1 Initiated");
    }

    a4(int r){
        this("Rahul");
        System.out.println("Constructor 2 Initiated by " + r);
    }

    a4(String s){
        System.out.println("Constructor 3 Initiated by " + s);
    }

    public static void main(String[] args){
        new a4();
    }
}
