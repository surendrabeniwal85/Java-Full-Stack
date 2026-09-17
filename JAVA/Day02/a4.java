public class a4 {
    public static void main(String[] args){

        int number = 1;

        while(number <= 5){
            if(number == 3){
                System.out.println("Skipping number : " + number);
                number++;
                continue;
            }
            System.out.println("Number : " + number);
            number++;      
        }
    }
}
