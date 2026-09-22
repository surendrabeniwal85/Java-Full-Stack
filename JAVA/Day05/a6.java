package JAVA.Day05;

// Hierarchical inheritance 

class vehicle{  // super class
    vehicle(){
        System.out.println("This is main car factory");
    }
}

class car extends vehicle{  // base 1
    car(){
        System.out.println("I have a car");
    }
}

class bus extends vehicle{   // base 2
    bus(){
        System.out.println("I travel in bus");
    }
}

public class a6 {

    public static void main(String[] args) {
        new car();
        new bus();
    }   
}
