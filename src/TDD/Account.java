package TDD;

import java.util.Objects;

public class Account {
    private double balance = 0;
    private String pin = "1234";

    public double checkBalance(){
        return  balance;
    }

    public void deposit(double amount){
        if(amount > 0)balance += amount;
    }

    public void withdraw(double amount, String accountPin) {
        if(Objects.equals(this.pin, accountPin)) {
            if(amount <= balance && amount >= 0)balance = balance - amount;
        }
        else {
            System.out.println("Pin not valid");
        }

    }


}
