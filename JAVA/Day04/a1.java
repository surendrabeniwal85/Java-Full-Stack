package JAVA.Day04;

public class a1 {

    int num = 20; //reference variable

    void a(int num){
        System.out.println("The value of global variable is : " + this.num);
        System.out.println("The value of var is : " + num);
    }

    public static void main(){
        a1 obj = new a1();
        obj.a(30);
    }
}


//always give precedence to local variable first