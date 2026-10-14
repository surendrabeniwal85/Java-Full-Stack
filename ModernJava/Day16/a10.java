package ModernJava.Day16;

//Switch expression with Enum

enum Level{
    LOW, MEDIUM, HIGH
}

public class a10 {
    public static void main(String[] args) {

        Level level = Level.HIGH;

        String message = switch (level){

            case LOW -> "Low Priority";

            case MEDIUM -> "Medium Priority";

            case HIGH -> "High Priority";
        };

        System.out.println(message);
    }
}
