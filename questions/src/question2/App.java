package question2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    /*
     * Problem Statement – Aly went to a movie with his friends in a Wave theatre
     * and during break time he bought pizzas, puffs and cool drinks. Consider the
     * following prices :
     * 
     * USD.20/pizza USD.5/puffs USD.6/cooldrink
     * 
     * Generate a bill for What Aly has bought.
     * 
     * 
     * Sample Input 1:
     * 
     * Enter the no of pizzas bought:10 Enter the no of puffs bought:12 Enter the no
     * of cool drinks bought:5
     * 
     * Sample Output 1:
     * 
     * Bill Details
     * 
     * No of pizzas:10
     * 
     * No of puffs:12
     * 
     * No of cooldrinks:5
     * 
     * Total price=1290
     * 
     * ENJOY THE SHOW!!!
     */
    public static void main(String[] args) {

        String[] menuItems = new String[] { "Pizza", "Puff", "Cooldrink" };
        Integer[] priceItems = new Integer[] { 20, 5, 6 };
        Integer[] qntyItems = new Integer[menuItems.length];

        float totalPrice = 0f;

        Scanner scanner = new Scanner(System.in);

        int loopCounter = 0;
        while (loopCounter < menuItems.length) {
            System.out.printf("Enter the no of %s's bought:", menuItems[loopCounter]);
            qntyItems[loopCounter] = scanner.nextInt();

            if (qntyItems[loopCounter] < 0) {
                System.out.println("Invalid input !");
                scanner.close();
                System.exit(0);
            }

            loopCounter++;
        }

        System.out.println("\n************************************");

        if (loopCounter == menuItems.length) {
            for (int i = 0; i < qntyItems.length; i++) {
                totalPrice += priceItems[i] * qntyItems[i];
                System.out.println(menuItems[i] + " QNTY: " + qntyItems[i]);

                if (i == qntyItems.length - 1) {
                    System.out.println("************************************");
                    System.out.printf("\nTotal price: %s USD \n%s", new DecimalFormat("0.00").format(totalPrice),
                            "Enjoy the show!!!!!!!!!!!!");
                }
            }
        }
    }
}
