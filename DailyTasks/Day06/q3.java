package DailyTasks.Day06;

class q3 {
    public static void main(String[] args) {
        try {
            int result = 10 / 2;
            System.out.println("Result = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception occurred.");
        } finally {
            System.out.println("Finally block always executes.");
        }
    }
}
