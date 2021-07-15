package atm_switch_oop;

import java.util.Scanner;

import atm_switch_oop.src.com.hyzcode.controller.AtmEngine;
import atm_switch_oop.src.com.hyzcode.view.AtmCLI_UI;

public class App {
    private static double initializeBalance = 0;
    private static boolean isUiReady = false;

    static void atmUI(AtmCLI_UI UI) {
        UI.executeUI();
    }

    public static void main(String[] args) throws Exception {
        AtmEngine atmEngine = new AtmEngine(initializeBalance);
        AtmCLI_UI UI = new AtmCLI_UI(isUiReady);

        Scanner scanner = new Scanner(System.in);

        String operation = null;
        double response = 0;
        boolean isAtmWorks = true;

        while (isAtmWorks) {
            atmUI(UI);

            if (UI.getIsUIReady()) {

                System.out.print("Please type for operation: ");
                operation = scanner.nextLine();

                switch (operation) {
                    case "q":
                        atmEngine.printExitMessage();
                        isAtmWorks = false;
                        break;
                    case "Q":
                        atmEngine.printExitMessage();
                        isAtmWorks = false;
                        break;
                    case "1":
                        atmEngine.showAtmBalance();
                        break;
                    case "2":
                        System.out.print("Please enter the amount of the money you want to withdraw:");
                        double withdrawMoney = scanner.nextInt();
                        scanner.nextLine();

                        if (withdrawMoney <= 0) {
                            atmEngine.noZeroAndMinusValue();
                            break;
                        }

                        response = atmEngine.withdrawMoney(withdrawMoney);
                        if (response != -1) {
                            System.out.printf("Operation successful new balance: %f \n", response);
                        } else {
                            System.out.println("Not enough balance.");
                        }
                        break;
                    case "3":
                        System.out.print("Please enter the amount of the money you want to add your balance:");
                        double newBalance = scanner.nextInt();
                        scanner.nextLine();

                        if (newBalance <= 0) {
                            atmEngine.noZeroAndMinusValue();
                            break;
                        }

                        response = atmEngine.addMoney(newBalance);
                        System.out.printf("Operation successfull, your new balance: %f \n", response);

                        break;
                    default:
                        System.out.println("Invaild operation !");
                        isAtmWorks = false;
                        scanner.close();
                }
            } else {
                System.out.println("********************************************************");
                System.out.println("Looks like ATM UI is off, would you like to turn it on ?");
                System.out.println("Yes OR 1 | No OR 2");
                System.out.println("********************************************************");
                System.out.print("Type:");

                String answer = scanner.nextLine().toLowerCase();

                System.out.println();

                if (answer.equals("yes") || answer.equals("1")) {
                    UI.switchUI();
                } else if (answer.equals("no") || answer.equals("2")) {
                    atmEngine.printExitMessage();
                    isAtmWorks = false;
                } else {
                    System.out.println("Not valid input.");
                    isAtmWorks = false;
                    atmEngine.printExitMessage();
                    scanner.close();
                }

            }

        }
    }
}
