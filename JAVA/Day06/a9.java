package JAVA.Day06;

import java.io.FileOutputStream;
import java.io.IOException;

public class a9 {

    public static void main(String[] args) {
        try{
            FileOutputStream output = new FileOutputStream("E:\\filename.txt");
            output.write("Hello".getBytes());
            output.close();  //must close manually
            System.out.println("Successfully wrote to the file.");
        } catch(IOException e){
            System.out.println("Error writing file");
        } 
    }
}

