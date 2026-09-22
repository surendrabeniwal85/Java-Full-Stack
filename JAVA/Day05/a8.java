package JAVA.Day05;

// multiple inheritance 

interface landVehicle{
    default void landInfo(){
        System.out.println("This is a Land Vehicle");
    }
}

interface waterVehicle{
    default void waterInfo(){
        System.out.println("This is a Water Vehicle");
    }
}

//subclass implementing both interfaces
class ampVehicle implements landVehicle, waterVehicle{
    ampVehicle(){
        System.out.println("This is a Amp Vehicle");
    }
}

public class a8 {
    public static void main(String[] args) {
        new ampVehicle();
    }
}
