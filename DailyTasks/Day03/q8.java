package DailyTasks.Day03;

//Bank Account with Deposit and Withdrawal

class BankAccount{
    String accHolder;
    double balance;

    void deposit(double amount){
        balance = balance + amount;
        System.out.println("Deposited : " + amount);
    }

    void withdraw(double amount){
        if(amount <= balance){
            balance = balance - amount;
            System.out.println("Withdrawn : " + amount);
        } else{
            System.out.println("Insufficient Balance");
        }
    }

    void displayBalance(){
        System.out.println("Account Holder : " + accHolder);
        System.out.println("Balance : " + balance);
    }
}

public class q8 {
    public static void main(String[] args){
        BankAccount acc = new BankAccount();

        acc.accHolder = "Surendra Beniwal";
        acc.balance = 10000;

        acc.deposit(5000);
        acc.withdraw(3000);

        acc.displayBalance();
    }
    
}
