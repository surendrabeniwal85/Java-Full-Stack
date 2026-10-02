package ModernJava.Day10;

//Consumer<T>

import java.util.function.Consumer;

public class a8 {
    public static void main(String[] args) {
     
        Consumer<String> printName = name -> System.out.println("Student : " + name);

        printName.accept("Surendra");
        printName.accept("Naman");
    }
}
