package JAVA.Day08;

public class a6 {

    public static <T extends Comparable<T>> T maximum(T a, T b){
        if(a.compareTo(b) > 0){
            return a;
        } else{
            return b;
        }
    }

    public static void main(String[] args) {
        System.out.println(maximum(20, 30));
        System.out.println(maximum("Raj", "Rahul"));
    }
}
