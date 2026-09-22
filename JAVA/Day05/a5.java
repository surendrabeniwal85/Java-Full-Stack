package JAVA.Day05;

//multilevel inheritance example 02

class AnimalB{
    AnimalB(){
        System.out.println("Animal");
    }
}

class Mammal extends AnimalB{
    Mammal(){
        System.out.println("Mammal");
    }
}

class DogB extends Mammal{
    DogB(){
        System.out.println("Dog");
    }
}

public class a5 {

    public static void main(String[] args) {
        new DogB(); 
    }
}