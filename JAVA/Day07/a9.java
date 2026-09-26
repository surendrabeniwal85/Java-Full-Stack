package JAVA.Day07;

import java.util.HashMap;

public class a9 {
    public static void main(String[] args) {
        
        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Rahul");
        students.put(102, "Amit");
        students.put(103, "Neha");
        students.put(103, "Surendra");
        students.put(104, "Amit");
        students.put(102, "Amit");

        System.out.println(students);

        System.out.println("Student 101: " + students.get(101));

        System.out.println("Contains key 104: " + students.containsKey(104));

    }
}
