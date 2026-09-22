package DailyTasks.Day05;

//Multiple Inheritance Through Interfaces

interface CameraR {

    void takePhoto();
}

interface MusicPlayerR {

    void playMusic();
}

class SmartphoneR implements CameraR, MusicPlayerR {

    @Override
    public void takePhoto() {
        System.out.println("Smartphone is taking a photo");
    }

    @Override
    public void playMusic() {
        System.out.println("Smartphone is playing music");
    }
}

public class q18 {

    public static void main(String[] args) {

        SmartphoneR smartphone = new SmartphoneR();

        smartphone.takePhoto();
        smartphone.playMusic();
    }
}