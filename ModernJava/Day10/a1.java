package ModernJava.Day10;

//Lambda 1 : Hello Express

interface Greeting{
    public void hello();
}

public class a1 {
    public static void main(String[] args) {

        Greeting obj = () -> System.out.println("Hello");
        obj.hello();
    }
}
