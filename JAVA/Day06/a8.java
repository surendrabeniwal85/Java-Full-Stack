package JAVA.Day06;

//Array index out of bond
//Use of multiple catch

public class a8 {

    public static void main(String[] args) {

        try{
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[10]); //ArrayIndex out of bound
            int result = 10/0; //arithmetic exception
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index does not exist.");
        } catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        } catch(Exception e){
            System.out.println("Something went wrong");
        }
    }
}

