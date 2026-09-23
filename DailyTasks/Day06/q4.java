package DailyTasks.Day06;

class q4 {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Exception handled: Cannot divide by zero.");
        } finally {
            System.out.println("Cleanup operation completed.");
        }
    }
}
