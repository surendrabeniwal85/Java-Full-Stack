package ModernJava.Day16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class a02 {
    public static void main(String[] args) {

        //var name; -> not allowed
        var name = "Hari";
        //var cannot be initiated with null
        //var age = null;

        //Hashmap without var
        Map<Integer, String> students = new HashMap<Integer, String>();
        students.put(10, "Rahul");
        System.out.println(students);

        //Hashmap with var
        //var students = new HashMap<Integer, String>();

        //var with generics collection
        var List = new ArrayList<String>();
        List.add("Rakesh");
        List.get(0);
    }
}
