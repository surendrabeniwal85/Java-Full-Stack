//Armstrong number from 1 to 1000

public class q20 {
    public static void main(String[] args){

        for(int i = 1; i <= 1000; i++){

            int n = i;
            int original = n;
            int sum = 0;
            int count = 0;

        while(n != 0){
            n = n / 10;
            count++;
        }

        n = i;

        while(n != 0){
            int lastDig = n % 10;
            int power = 1;
            for(int j = 1; j <= count; j++){
                power = power * lastDig;
            }
            sum = sum + power;
            n = n / 10;
        }

        if(sum == original){
            System.out.println(original + " ");
        } 
        }
    }  
}