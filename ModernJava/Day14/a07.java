package ModernJava.Day14;

//Local time

import java.time.LocalTime;

public class a07 {
    public static void main(String[] args) {
        
        LocalTime now = LocalTime.now();
        System.out.println(now);

        //For current hour
        System.out.println(now.getHour());

        //For current minute
        System.out.println(now.getMinute());

        //For current second
        System.out.println(now.getSecond());

        //For current Nanosecond
        System.out.println(now.getNano());

        //Customized Time
        LocalTime CustomTime = LocalTime.of(12, 2, 23);
        System.out.println(CustomTime);

        //Parsing
        String timeString = "15:30:45";
        LocalTime.parse(timeString);

        //Previous Hour
        LocalTime pastTime = now.minusHours(1);
        System.out.println(pastTime);
    }
}
