package DailyTasks.Day05;

//constructor in inheritance

class ParentE {

    ParentE() {
        System.out.println("Parent constructor");
    }
}

class ChildE extends ParentE {

    ChildE() {
        System.out.println("Child constructor");
    }
}

public class q5 {

    public static void main(String[] args) {

        new ChildE();
    }
}
