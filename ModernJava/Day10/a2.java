package ModernJava.Day10;

//Lambda with string

interface NameHCL{
    public void name(String name);
}

public class a2 {
    public static void main(String[] args) {

        NameHCL obj = (name) -> System.out.println("Welcome " + name);
        obj.name("Surendra Beniwal");
    }
}
