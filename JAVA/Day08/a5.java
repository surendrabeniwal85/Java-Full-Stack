package JAVA.Day08;

public class a5 {
    //Generic method example

    static<T> void genericDisplay(T element){
        System.out.println(element.getClass().getName() + " = " + element);
    }

    public static void main(String[] args) {
        //Calling generic method with integer argument
        genericDisplay(11);

        //Calling generic method with String argument
        genericDisplay("HCL Students");

        //Calling generic method with double argument
        genericDisplay(1.0);
    }
}
