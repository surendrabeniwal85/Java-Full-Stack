package ModernJava.Day14;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//Date Formatter

public class a11 {
    public static void main(String[] args) {
        
        String Date = "05/10/2026";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate parse = LocalDate.parse(Date, dateTimeFormatter);
        System.out.println(parse);
    }
}