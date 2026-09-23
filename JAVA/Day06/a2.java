package JAVA.Day06;

import java.io.FileInputStream;

public class a2 {

    public static void main(String[] args) {
        
        try{
            FileInputStream fis = new FileInputStream("E:\\a.txt");
            System.out.println("File opened successfully.");
        } catch (Exception e){
            System.out.println(e);
        }
    }
}

