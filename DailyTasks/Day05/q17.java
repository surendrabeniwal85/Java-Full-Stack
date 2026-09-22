package DailyTasks.Day05;

//default method in interface

interface FareQ {

    default void fareInfo() {
        System.out.println("Bus fare information is available");
    }
}

class BusQ implements FareQ {

    void travel() {
        System.out.println("Bus is travelling");
    }
}

public class q17 {

    public static void main(String[] args) {

        BusQ bus = new BusQ();

        bus.fareInfo();
        bus.travel();
    }
}
