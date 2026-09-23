package DailyTasks.Day06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

class q19 {
    public static void main(String[] args) {

        // Checked exception
        try {
            FileInputStream file = new FileInputStream("data.txt");
            System.out.println("File opened.");
            file.close();
        } catch (FileNotFoundException e) {
            System.out.println("Checked exception: File not found.");
        } catch (Exception e) {
            System.out.println("File error.");
        }

        // Unchecked exception
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Unchecked exception: Cannot divide by zero.");
        }
    }
}