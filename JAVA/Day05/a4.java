package JAVA.Day05;

// multilevel inheritance

class Vehicle{
    Vehicle(){
        System.out.println("This is a car factory");
    }
}

class Car extends Vehicle{
    Car(){
        System.out.println("This is a Honda Showroom");
    }
}

class Bus extends Car{
    Bus(){
        System.out.println("This is a bus");
    }
}



public class a4 {

    public static void main(String[] args) {
        new Bus();
    }
}
