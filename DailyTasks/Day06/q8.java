package DailyTasks.Day06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

class q8 {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("data.txt");
            System.out.println("File opened successfully.");
            file.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (Exception e) {
            System.out.println("Error while handling file.");
        }
    }
}