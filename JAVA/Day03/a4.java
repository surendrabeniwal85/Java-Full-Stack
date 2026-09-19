package JAVA.Day03;

public class a4 {

    String voice;

    void sound(){
        System.out.println("Dog Barks");
    }

    public static void main(String[] args){

        a4 obj = new a4();
        obj.sound();
        obj.voice = "Meow";
        System.out.println("Cat voice is : " + obj.voice);
    }
}
