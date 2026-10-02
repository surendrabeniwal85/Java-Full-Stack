package ModernJava.Day10;

//Supplier<T>

import java.util.function.Supplier;

public class a9 {
    public static void main(String[] args) {

        Supplier<String> studentName = () -> "Surendra";

        System.out.println("Student : " + studentName.get());
    }
}

