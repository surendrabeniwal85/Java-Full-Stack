package JAVA.Day08;

//List with generics

import java.util.ArrayList;
import java.util.List;

public class a2 {
    public static void main(String[] args) {
        
        List<String> lst = new ArrayList<>();
        lst.add("Rahul");
        lst.add("Raj");
        
        String name1 = lst.get(0);
        System.out.println(name1);

        String name2 = lst.get(1);
        System.out.println(name2);
    }
}
