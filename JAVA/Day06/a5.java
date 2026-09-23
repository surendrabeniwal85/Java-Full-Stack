package JAVA.Day06;

//Run time exception -2 or unchecked exception 

public class a5 {
    public static void main(String[] args) {

        String name = null;
        String name1 = "HCL";

        try{
            System.out.println(name.length());
            System.out.println(name1.length());
        }catch (NullPointerException e){
            System.out.println("Null pointer value cannot be used");
        }
    }
}

