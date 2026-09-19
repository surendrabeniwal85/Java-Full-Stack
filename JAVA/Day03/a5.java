package JAVA.Day03;

public class a5 {

    public void get(){
        System.out.println("I am watching Tv");
    }

    public static void main(String[] srgs){

        a5 obj = new a5();
        obj.get();
        obj.get();
        obj.set();
        obj.set();
    }

    public void set(){
        System.out.println("I am Eating");
    }
    
}
