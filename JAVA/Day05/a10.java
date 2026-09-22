package JAVA.Day05;

//java interface

interface animal{
    public void sound();

    public void eat();
}

class cat implements animal{
    public void sound(){
        System.out.println("Cat Meows");
    }

    public void eat(){
        System.out.println("Cat eats fish");
    }
}

public class a10 {
    public static void main(String[] args) {
       cat obj = new cat();
       obj.sound();
       obj.eat();
    }
}
