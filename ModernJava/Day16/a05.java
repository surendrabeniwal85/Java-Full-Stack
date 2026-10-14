package ModernJava.Day16;

public class a05 {
    public static void main(String[] args) {

        int day = 2;
        String result;

        switch (day) {
            case 1:
                result = "Monday";
                break;
            case 2:
                result = "Tuesday";
                break;
            case 3:
                result = "Friday";
                break;
            default:
                result = "Invalid Day";
                break;
        }
        System.out.println(result);
    }
}
