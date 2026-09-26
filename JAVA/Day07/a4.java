package JAVA.Day07;

import java.util.ArrayList;

public class a4 {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("Surendra");
        students.add("Naman");
        students.add("Ayush");
        students.add("Pulkit");

        System.out.println(students);

        System.out.println("First Student : " + students.get(0));

        students.set(1, "Ravi");

        students.remove("Ayush");

        System.out.println("After  modification : " + students);
    }
}
