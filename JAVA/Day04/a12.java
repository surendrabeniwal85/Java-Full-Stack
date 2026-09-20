package JAVA.Day04;

//default access modifier

class Car{
    String model;
}

public class a12 {

    public static void main(String[] args){
        Car c = new Car();
        c.model = "Tesla";
        System.out.println(c.model);
    }
}
