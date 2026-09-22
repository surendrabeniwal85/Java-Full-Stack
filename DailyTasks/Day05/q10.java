package DailyTasks.Day05;

//Runtime polymorphism

class AnimalJ {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class DogJ extends AnimalJ {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class CatJ extends AnimalJ {

    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class q10 {

    public static void main(String[] args) {

        AnimalJ animal;

        animal = new DogJ();
        animal.sound();

        animal = new CatJ();
        animal.sound();
    }
}
