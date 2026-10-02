package ModernJava.Day10;

// Comparison of two numbers

interface Greater{
    public void compare(int a , int b);
}

public class a4 {
    public static void main(String[] args) {
        
        Greater obj = (a, b) -> System.out.println((a > b) ? a : b);
        System.out.print("The greater number is : ");
        obj.compare(10, 20);
    }
}
