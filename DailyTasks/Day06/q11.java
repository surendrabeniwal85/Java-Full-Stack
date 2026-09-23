package DailyTasks.Day06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

class q11 {

    static void readFile() throws FileNotFoundException {
        FileInputStream file = new FileInputStream("data.txt");
        System.out.println("File opened successfully.");
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
