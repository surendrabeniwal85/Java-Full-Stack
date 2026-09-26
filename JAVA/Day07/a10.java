package JAVA.Day07;

import java.util.HashMap;

public class a10 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Java");
        map.put(2, "Python");

        System.out.println(map.get(1)); //Get key value
        
        System.out.println(map.containsKey(2)); //Get boolean

        System.out.println(map.size());
    } 
}
