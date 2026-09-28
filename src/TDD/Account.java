package TDD;

public class Account {
    private double balance = 0;
    private int pin = 1234;

    public double checkBalance(){
        return  balance;
    }

    public void deposit(double amount){
        if(amount > 0)balance += amount;
    }

    public void withdraw(double amount, int accountPin) {
        if(this.pin == accountPin) {
            if(amount <= balance && amount >= 0)balance = balance - amount;
        }
        else {
            System.out.println("Pin not valid");
        }

    }


}
