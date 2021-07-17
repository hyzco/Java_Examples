package question8;

import java.util.Scanner;

public class App {
    /*
     * Problem Statement – Goutam and Tanul plays by telling numbers. Goutam says a
     * number to Tanul. Tanul should first reverse the number and check if it is
     * same as the original. If yes, Tanul should say “Palindrome”. If not, he
     * should say “Not a Palindrome”. If the number is negative, print “Invalid
     * Input”. Help Tanul by writing a program.
     * 
     * Sample Input 1 :
     * 
     * 21212
     * 
     * Sample Output 1 :
     * 
     * Palindrome
     * 
     * Sample Input 2 :
     * 
     * 6186
     * 
     * Sample Output 2 :
     * 
     * Not a Palindrome
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* way 1 */

        Integer input = scanner.nextInt();
        String reversed = "";

        scanner.close();

        if (!(input > -1)) {
            System.out.println("Invalid Input.");
        }

        for (int i = input.toString().length() - 1; i >= 0; i--) {
            reversed += input.toString().charAt(i);
        }

        if (Integer.parseInt(reversed) == input) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        /* way 2 */
        // int number = scanner.nextInt();
        // scanner.close();
        // int sum = 0, reverse;
        // int temp = number;

        // if (number > -1) {
        //     while (number > 0) {
        //         reverse = number % 10;
        //         sum = (sum * 10) + reverse;
        //         number = number / 10;
        //     }

        //     if (temp == sum) {
        //         System.out.println("Palindrome");
        //     } else {
        //         System.out.println("Not a Palindrome");
        //     }
        // } else {
        //     System.out.println("Invalid Input");
        // }
    }
}
