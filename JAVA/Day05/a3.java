package JAVA.Day05;

//Single level inheritance

class AnimalA{
    void eat(){
        System.out.println("Animal Eats");

    }
}

class DogA extends AnimalA{
    void bark(){
        super.eat();
        System.out.println("Dog Barks");
    }
}

public class a3{

    public static void main(String[] args) {
        DogA obj = new DogA();
        obj.bark();
    }
}
