package JAVA.Day09;

//Example of stack usage

public class a2 {

    public static void main(String[] args) {
        int x = 20;   //stored in stack
        int y = 20;   //stored in stack
        int result = add(x, y);
    }

    public static int add(int a, int b){
        int sum = a + b;
        return sum;
    }
}
