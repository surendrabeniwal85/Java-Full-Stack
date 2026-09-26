package JAVA.Day07;

import java.util.HashSet;

public class a6 {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);

        System.out.println(numbers);

        System.out.println("Contains 20 : " + numbers.contains(20));
    }
}
