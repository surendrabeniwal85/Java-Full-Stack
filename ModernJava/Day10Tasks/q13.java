package ModernJava.Day10Tasks;

// 13. Print All Elements of a List Using Consumer

import java.util.ArrayList;
import java.util.function.Consumer;

public class q13 {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Rahul");
        students.add("Aman");
        students.add("Priya");
        students.add("Neha");
        students.add("Rohit");

        Consumer<String> obj = (name) -> {
            System.out.println(name);
        };

        students.forEach(obj);
    }
}
