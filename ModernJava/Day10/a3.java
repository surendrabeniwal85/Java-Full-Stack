package ModernJava.Day10;

//Lambda for Addition - Use of two Parameters

@FunctionalInterface 
interface myAddtion{
    public void addSum(int a, int b);
}

public class a3 {

    public static void main(String[] args) {

        myAddtion obj1 = (a, b) -> System.out.println(a + b);
        obj1.addSum(5, 6);
    }
}
