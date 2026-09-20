package JAVA.Day04;

class animal{
    void display1(){
        System.out.println("I am Super class");
    }
}

class dog extends animal{
    void display(){
        System.out.println("The dog barks");
    }
}

public class a7 {

    public static void main(String[] args){
        dog obj = new dog();
        obj.display();
        obj.display1();
    } 
}
