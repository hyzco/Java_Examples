package atm_switch_oop.src.com.hyzcode.model;

public class Atm {
    private double balance;

    public Atm(double balance){
        this.balance = balance;
    }

    protected double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }
}
