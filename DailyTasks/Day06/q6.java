package DailyTasks.Day06;

class q6 {
    public static void main(String[] args) {
        String name = null;

        try {
            System.out.println("Length = " + name.length());
        } catch (NullPointerException e) {
            System.out.println("String is null.");
        }
    }
}