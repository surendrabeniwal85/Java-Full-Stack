package ModernJava.Day16;

public class a09 {
    public static void main(String[] args) {
        
        String language = "Java";

        String type = switch(language){

            case "Java" -> "Object-Oriented";
            case "Python" -> "Interpreted";
            case "C" -> "Procedural";

            default -> "Unknown";
        };

        System.out.println(type);
    }
}
