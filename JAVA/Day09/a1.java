package JAVA.Day09;

import java.util.ArrayList;
import java.util.*;

public class a1 {
    public static void main(String[] args) {

        List<int[]> lst = new ArrayList<>();
        int count = 0;
        while(true){
            lst.add(new int[1]); //Don't put the value greater than size of int
            count++;
            System.out.println("Allocated Block : " + count);
        }
    }
}
