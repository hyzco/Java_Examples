package question7;

import java.util.Scanner;

public class App {
    /*
     * Question-7 Problem Statement – To speed up his composition of generating
     * unpredictable rhythms, Blue Bandit wants the list of prime numbers available
     * in a range of numbers.Can you help him out?
     * 
     * Write a java program to print all prime numbers in the interval [a,b] (a and
     * b, both inclusive).
     * 
     * Note
     * 
     * Input 1 should be lesser than Input 2. Both the inputs should be positive.
     * Range must always be greater than zero. If any of the condition mentioned
     * above fails, then display “Provide valid input”
     * 
     * Use a minimum of one for loop and one while loop
     * 
     * Sample Input 1:
     * 
     * 2
     * 
     * 15
     * 
     * Sample Output 1:
     * 
     * 2 3 5 7 11 13
     * 
     * Sample Input 2:
     * 
     * 8
     * 
     * 5
     * 
     * Sample Output 2:
     * 
     * Provide valid input
     */
    public static void main(String[] args) {

        // int a, b;

        // Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter A:");
        // a = scanner.nextInt();

        // System.out.print("Enter B:");
        // b = scanner.nextInt();

        // scanner.close();

        // if (a < b && a > 0 && b > 0) {
        // for(int i = a; i < b; i++){
        // if(i%1 == 0 && i%i == 0){
        // System.out.print(i+" ");
        // }
        // }
        // }else{
        // System.out.println("Provide valid input.");
        // }

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        int b = scanner.nextInt();
                scanner.close();
        boolean isPrime;

        if (a <= 0 || b <= 0 || a >= b) {
            System.out.println("Provide valid input");
        } else {
            while (a <= b) {
                if (a == 1) {
                    a++;
                } else if (a == 2) {
                    System.out.print(a + " ");
                } else {
                    isPrime = false;

                    for (int i = 2; i <= a/2; i++) {
                        if (a % i == 0) {
                            isPrime = true;
                            break;
                        }
                    }

                    if (!isPrime) {
                        System.out.print(a + " ");
                    }
                }
                a++;
            }
        }
    }
}
