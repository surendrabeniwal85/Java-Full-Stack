package DailyTasks.Day03;

//Car information using class and object

class Car{
    String brand;
    String model;
    int year;

    void display(){
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Year : " + year);
    }
}

public class q9 {
    public static void main(String[] args){
        Car c = new Car();

        c.brand = "Toyoto";
        c.model = "Fortuner";
        c.year = 2025;

        c.display();
    }
}