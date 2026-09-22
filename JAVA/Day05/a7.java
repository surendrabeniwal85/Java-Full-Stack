package JAVA.Day05;

// Hierachical inheritance example 02

class AnimalC{
    AnimalC(){
        System.out.println("Animal is Creature");
    }
}

class DogC extends AnimalC{
    DogC(){
        System.out.println("The Dog Barks");
    }
}

class CatC extends AnimalC{
    CatC(){
        System.out.println("The Cat Meows");
    }
}

public class a7{

    public static void main(String[] args) {
        new DogC();
        new CatC();
    }
}

