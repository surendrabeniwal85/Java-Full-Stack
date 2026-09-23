package JAVA.Day06;

//print exception

public class a6 {

    public static void main(String[] args) {
        try{
            int a = 100, b = 0, c;
            c = a / b;
            System.out.println(c);
        } catch(Exception e){
            //System.out.println(e);
            //e.printStackTrace(); //print exception E + D + S T
            //System.out.println(e.toString()); //print E + D
            System.out.println(e.getMessage()); //only D
        }
    }   
}

