package JAVA.Day05;

//method overriding

class Animal{
    String print(String name){
        return name;
    }
}

class Dog extends Animal{
    @Override 
    String print(String Barks){
        return Barks;
    }
}

class Cat extends Animal{
    @Override 
    String print(String Meouw){
        return Meouw;    
    }
}

public class a2{

    public static void main(String[] args) {
        Dog d = new Dog();
        System.out.println(d.print("Barks"));

        Cat c = new Cat();
        System.out.println(c.print("Meow"));
    }
}
