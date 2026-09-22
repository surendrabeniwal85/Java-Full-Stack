package DailyTasks.Day05;

//abstract class + inheritance

abstract class EmployeeL {

    String name;

    EmployeeL(String name) {
        this.name = name;
    }

    abstract void work();
}

class ManagerL extends EmployeeL {

    ManagerL(String name) {
        super(name);
    }

    @Override
    void work() {
        System.out.println(name + " manages the team");
    }
}

class DeveloperL extends EmployeeL {

    DeveloperL(String name) {
        super(name);
    }

    @Override
    void work() {
        System.out.println(name + " develops software");
    }
}

public class q12 {

    public static void main(String[] args) {

        ManagerL manager = new ManagerL("Rahul");
        DeveloperL developer = new DeveloperL("Surendra");

        manager.work();
        developer.work();
    }
}
