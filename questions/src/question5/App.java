package question5;

import java.util.Scanner;

public class App {
    /*
     * Question-5 Problem Statement – In a theater, there is a discount scheme
     * announced where one gets a 10% discount on the total cost of tickets when
     * there is a bulk booking of more than 20 tickets, and a discount of 2% on the
     * total cost of tickets if a special coupon card is submitted.
     * 
     * Develop a program to find the total cost as per the scheme. The cost of the k
     * class ticket is Rs.75 and q class is Rs.150. Refreshments can also be opted
     * by paying an additional of Rs. 50 per member.
     * 
     * Hint: k and q and You have to book minimum of 5 tickets and maximum of 40 at
     * a time. If fails display “Minimum of 5 and Maximum of 40 Tickets”. If circle
     * is given a value other than ‘k’ or ‘q’ the output should be “Invalid Input”.
     * 
     * The ticket cost should be printed exactly to two decimal places.
     * 
     * Sample Input 1:
     * 
     * Enter the no of ticket:35 Do you want refreshment:y Do you have coupon code:y
     * Enter the circle:k
     * 
     * Sample Output 1: Ticket cost:4065.25
     * 
     * Sample Input 2: Enter the no of ticket:1
     * 
     * Sample Output 2: Minimum of 5 and Maximum of 40 Tickets
     */
    public static void main(String[] args) {
        double cost = 0d, total = 0d;
        int noTicket = 0;
        boolean refreshment = false, hasCoupon = false;
        char circle;

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the no of ticket:");
        noTicket = userInput.nextInt();
        userInput.nextLine();

        if (!(noTicket >= 5 && noTicket <= 40)) {
            System.out.println("Minimum of 5 and Maximum of 40 Tickets");
            userInput.close();
            System.exit(0);
        }

        System.out.print("Do you want refreshment:");
        refreshment = userInput.next().charAt(0) == 'y' ? true : false;
        System.out.print("Do you have coupon code:");
        hasCoupon = userInput.next().charAt(0) == 'y' ? true : false;

        System.out.print("Enter the circle:");
        circle = userInput.next().charAt(0);

        if (!(circle == 'k' || circle == 'q')) {
            System.out.println("Invalid Input.");
            userInput.close();
            System.exit(0);
        }

        cost = circle * (circle == 'k' ? 75 : circle == 'q' ? 150 : 0);

        if (cost != 0) {
            total = cost;

            if (noTicket > 20) {
                cost = cost - (cost * (0.1));
                total = cost;
            }
            if (hasCoupon) {
                total = cost - (cost * (0.02));
            }
            if (refreshment) {
                total += (noTicket * 50);
            }

            System.out.println("total cost" + total);
        }

    }
}
