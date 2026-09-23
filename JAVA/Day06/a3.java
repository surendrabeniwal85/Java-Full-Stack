package JAVA.Day06;

//Compile time exception - 3

public class a3 {

    public static void main(String[] args) {
        //Loading Java Mysql Driver
        //Class.forName("com.mysql.jdbc.driver");
        
        try{
            Class.forName("com.mysql.jdbc.driver");
        } catch (Exception e){
            System.out.println(e);
        }
    }
}

