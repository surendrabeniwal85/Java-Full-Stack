package DailyTasks.Day05;

//single inheritance

class AnimalB {

    void eat() {
        System.out.println("Animal is eating");
    }
}

class DogB extends AnimalB {

    void bark() {
        System.out.println("Dog is barking");
    }
}

public class q2 {

    public static void main(String[] args) {

        DogB dog = new DogB();

        dog.eat();
        dog.bark();
    }
}
