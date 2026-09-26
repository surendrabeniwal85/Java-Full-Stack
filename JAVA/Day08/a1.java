package JAVA.Day08;

import java.util.ArrayList;

public class a1 {
    public static void main(String[] args) {
        
        String[] arr1 = new String[4];
        //System.out.println(arr[0]);

        ArrayList<Object> arr = new ArrayList<>();
        arr.add("Surendra");
        arr.add("Rahul");
        arr.add(true);
        
        System.out.println(arr);
        System.out.println(arr.get(0));
        System.out.println(arr.contains("Rahul"));
        System.out.println(arr.getFirst());
        System.out.println(arr.getLast());
        System.out.println(arr.getClass());

        arr1[0] = (String) arr.getFirst();
        System.out.println(arr1[0]);
    }
}
