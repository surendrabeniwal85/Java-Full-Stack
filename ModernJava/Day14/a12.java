package ModernJava.Day14;

import java.time.LocalDate;
import java.time.Period;

//Calculate age and date difference 

public class a12 {
    public static void main(String[] args) {

        //Date of birth
        LocalDate dob = LocalDate.of(2004, 8, 13);

        //Current date
        LocalDate today = LocalDate.now();

        //Calculate Period
        Period age = Period.between(dob, today);

        System.out.println("Date of birth : " + dob);
        System.out.println("Today : " + today);

        System.out.println("\nAge : ");
        System.out.println("Years : " + age.getYears());
        System.out.println("Months : " + age.getMonths());
        System.out.println("Days : " + age.getDays());

        System.out.println("\nComplete age : "
            + age.getYears() + " Years, "
            + age.getMonths() + " Months, "
            + age.getDays() + " Days"
        );
    }
}
