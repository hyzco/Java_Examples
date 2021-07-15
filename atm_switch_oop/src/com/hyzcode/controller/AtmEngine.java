package atm_switch_oop.src.com.hyzcode.controller;

import atm_switch_oop.src.com.hyzcode.model.Atm;

interface IAtmEngine {
    double withdrawMoney(double withdraw);

    double addMoney(double addMoney);

    void updateAtmBalance(double newBalance);

    void showAtmBalance();

    void printExitMessage();

    void notEnoughBalance();

    void noZeroAndMinusValue();
}

public class AtmEngine extends Atm implements IAtmEngine {
    /* Initialization */
    public AtmEngine(double initialBalance) {
        super(initialBalance);
    }
    /* Initialization */

    public double withdrawMoney(double withdraw) {
        double currentBallance = this.getBalance();
        double newBallance = currentBallance -= withdraw;

        if (newBallance < 0) {
            this.notEnoughBalance();
            return -1;
        } else {
            this.setBalance(newBallance);
            return currentBallance;
        }
    }

    public double addMoney(double addMoney) {
        double currentBallance = this.getBalance();
        double newBallance = currentBallance += addMoney;

        this.setBalance(newBallance);
        return newBallance;
    }

    @Override
    public void updateAtmBalance(double newBalance) {
        this.setBalance(newBalance);
    }

    @Override
    public void showAtmBalance() {
        System.out.printf("Your current ballance: %f \n", this.getBalance());
    }

    @Override
    public void printExitMessage() {
        System.out.println("Thank you for choosing us.");
    }

    @Override
    public void notEnoughBalance() {
        System.out.println("Your balance is not enough");
    }

    @Override
    public void noZeroAndMinusValue() {
        System.out.println("You can not enter zero or minus value.");
    }

}
