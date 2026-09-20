package JAVA.Day04;

//super is used to refer to the parent class constructor.

class parent3{
    parent3(){
        super();
        System.out.println("Parent printed");
    }
}
class child3 extends parent3{
    child3(){
        System.out.println("Child printed");
    }
} 

public class a9 {
    public static void main(String[] args){
        new child3();
    }
}
