package JAVA.Day08;

//Bounded types 

public class a10 {
    public static <T extends Number> double multiply(T value){
        double n = value.doubleValue();
        return n * n;
    }

    public static void main(String[] args) {
        System.out.println(multiply(10));
        System.out.println(multiply(5));
    }
}
