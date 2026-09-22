package DailyTasks.Day05;

//mutilevel inheritance

class AnimalC {

    void eat() {
        System.out.println("Animal is eating");
    }
}

class MammalC extends AnimalC {

    void breathe() {
        System.out.println("Mammal is breathing");
    }
}

class DogC extends MammalC {

    void bark() {
        System.out.println("Dog is barking");
    }
}

public class q3 {

    public static void main(String[] args) {

        DogC dog = new DogC();

        dog.eat();
        dog.breathe();
        dog.bark();
    }
}
