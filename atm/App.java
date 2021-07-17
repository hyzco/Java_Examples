package atm;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int balance = 0, withDrawMoney = 0, newBalance = 0;
        String operation = null;

        String atmString = "ATM Operations Menu; \n" + "1. Operation: View your balance \n"
                + "2. Operation: Withdraw money \n" + "3. Operation: Add balance \n" + "Press Q to exit.";

        System.out.println("****************************");
        System.out.println(atmString);
        System.out.println("****************************");

        while (true) {
            System.out.print("Please type for operation: ");
            operation = scanner.nextLine();

            if (operation.equals("q") || operation.equals("Q")) {
                System.out.println("Thank you for choosing us. Good bye.");
                break;
            }

            if (operation.equals("1")) {

                System.out.printf("Your current balance: %d \n", balance);

            } else if (operation.equals("2")) {

                System.out.print("Please enter the amount of the money you want to withdraw:");
                withDrawMoney = scanner.nextInt();
                scanner.nextLine();

                newBalance = balance - withDrawMoney;

                if (withDrawMoney <= 0) {
                    System.out.println("Operation is failed, you can not type 0 or - value");
                } else if (newBalance < 0) {
                    System.out.printf("Sorry, your balance %d is not enough to withdraw %d. \n", balance,
                            withDrawMoney);
                } else {
                    System.out.println("Operation is successfull.");
                    balance -= withDrawMoney;
                }
                System.out.printf("Your balance %d%n", balance);

            } else if (operation.equals("3")) {

                System.out.print("Please enter the amount of the money you want to add your balance:");
                int addBalance = scanner.nextInt();
                scanner.nextLine();

                if (addBalance <= 0) {
                    System.out.println("Operation is failed, you can not type 0 or - value");
                } else if (addBalance > 0) {
                    balance += addBalance;
                    System.out.println("Operation successfull, your new balance is:" + balance);
                }

            } else {
                System.out.println("Invaild operation. Please try again.");
                scanner.close();
            }
        }
    }
}