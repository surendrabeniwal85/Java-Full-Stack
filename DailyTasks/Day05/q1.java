package DailyTasks.Day05;

//basic inheritance

class VehicleA {

    String brand = "Honda";

    void start() {
        System.out.println("Vehicle is starting");
    }

    void stop() {
        System.out.println("Vehicle is stopping");
    }
}

class CarA extends VehicleA {

    void drive() {
        System.out.println("Car is driving");
    }
}

public class q1 {

    public static void main(String[] args) {

        CarA car = new CarA();

        System.out.println("Brand: " + car.brand);
        car.start();
        car.drive();
        car.stop();
    }
}