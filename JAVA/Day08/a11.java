package JAVA.Day08;

//Upper Bound 

class Animal{

    void sound(){
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal{
    
    void bark(){
        System.out.println("Dog is barking");
    }
}

class TestT<T extends Animal>{

    T animal;
    //Animal + upper bound // dog + actual type

    TestT(T animal){
        this.animal = animal;
    }

    void display(){
        animal.sound();
    }
}

public class a11 {
    public static void main(String[] args) {
        TestT<Dog> obj = new TestT<>(new Dog());
        obj.display();
    }
}
