package ModernJava.Day16;

public class a08 {
    public static void main(String[] args) {
        
        int marks = 85;

        String result = switch(marks / 10){

            case 10, 9, 8 ->{
                System.out.println("Excellent Performance");
                yield "Grade A";
            }

            case 7 ->{
                yield "Grade B";
            }

            case 6 ->{
                yield "Grade C";
            }

            default ->{
                yield "Fail";
            }
        };

        System.out.println(result);
    }
}
