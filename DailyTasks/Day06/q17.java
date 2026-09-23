package DailyTasks.Day06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

class q17 {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("data.txt");

            int data;

            while ((data = file.read()) != -1) {
                System.out.print((char) data);
            }

            file.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (Exception e) {
            System.out.println("Error while reading file.");
        }
    }
}
