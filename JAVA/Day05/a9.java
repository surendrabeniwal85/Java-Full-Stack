package JAVA.Day05;

//hybrid inheritance 

class vehicleV{
    void engine(){
        System.out.println("It is a Masterclass engine");
    }
}

interface fare{
    default void fareInfo(){ //this is abstract method
        System.out.println("The fare in the bus is normal");
    }
}


class marutiM extends vehicleV{
    void marutiEngine(){
        System.out.println("Maruti has a powerful engine");
    }
}

class busB extends vehicleV implements fare{
    void busType(){
        System.out.println("This is a bus type");
    }
}


public class a9 {
    public static void main(String[] args) {
        //maruti object
        marutiM obj = new marutiM();

        obj.engine();
        obj.marutiEngine();

        //bus object
        busB obj1 = new busB();

        obj1.fareInfo();
        obj1.busType();
        obj1.engine();
    }
    
}
