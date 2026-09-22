package DailyTasks.Day05;

//multiple interfaces

interface PrintableO {

    void print();
}

interface ShowableO {

    void show();
}

class DemoO implements PrintableO, ShowableO {

    @Override
    public void print() {
        System.out.println("Printing document");
    }

    @Override
    public void show() {
        System.out.println("Showing document");
    }
}

public class q15 {

    public static void main(String[] args) {

        DemoO demo = new DemoO();

        demo.print();
        demo.show();
    }
}
