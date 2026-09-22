package DailyTasks.Day05;

//hierarchical inheritance

class AnimalD {

    void eat() {
        System.out.println("Animal is eating");
    }
}

class DogD extends AnimalD {

    void bark() {
        System.out.println("Dog is barking");
    }
}

class CatD extends AnimalD {

    void meow() {
        System.out.println("Cat is meowing");
    }
}

public class q4 {

    public static void main(String[] args) {

        DogD dog = new DogD();
        CatD cat = new CatD();

        dog.eat();
        dog.bark();

        System.out.println();

        cat.eat();
        cat.meow();
    }
}
