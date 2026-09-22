package DailyTasks.Day05;

//method overriding

class AnimalI {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class DogI extends AnimalI {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class CatI extends AnimalI {

    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class q9 {

    public static void main(String[] args) {

        DogI dog = new DogI();
        CatI cat = new CatI();

        dog.sound();
        cat.sound();
    }
}
