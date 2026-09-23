package DailyTasks.Day06;

class q12 {

    static void performOperations() throws ArithmeticException, ArrayIndexOutOfBoundsException {
        int result = 10 / 0;

        int[] numbers = {10, 20, 30};
        System.out.println(numbers[5]);
    }

    public static void main(String[] args) {
        try {
            performOperations();
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception occurred.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index exception occurred.");
        }
    }
}
