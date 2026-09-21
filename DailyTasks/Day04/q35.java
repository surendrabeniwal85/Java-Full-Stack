package DailyTasks.Day04;

//Comparison of All Access Modifiers

class AccessModifiers {

    public String publicName = "Public";
    protected String protectedName = "Protected";
    String defaultName = "Default";
    private String privateName = "Private";

    void display() {
        System.out.println(publicName);
        System.out.println(protectedName);
        System.out.println(defaultName);
        System.out.println(privateName);
    }
}

public class q35 {

    public static void main(String[] args) {

        AccessModifiers obj = new AccessModifiers();

        System.out.println(obj.publicName);
        System.out.println(obj.protectedName);
        System.out.println(obj.defaultName);
        
        //privateName cannot be accessed directly here

        obj.display();
    }
}
