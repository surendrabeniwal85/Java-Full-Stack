package DailyTasks.Day05;

//interface + inheritance

class VehicleP {

    void start() {
        System.out.println("Vehicle is starting");
    }
}

interface FareP {

    void calculateFare();
}

class BusP extends VehicleP implements FareP {

    @Override
    public void calculateFare() {
        System.out.println("Bus fare is Rs. 50");
    }

    void travel() {
        System.out.println("Bus is travelling");
    }
}

public class q16 {

    public static void main(String[] args) {

        BusP bus = new BusP();

        bus.start();
        bus.calculateFare();
        bus.travel();
    }
}
