package question10;

import java.util.Scanner;

public class App {
    /*
     * Question-10 Problem Statement – Aly planned to choose a four digit lucky
     * number for his car.
     * 
     * His lucky numbers are 3,5 and 7. Help him find the number, whose sum is
     * divisible by 3 or 5 or 7.
     * 
     * Provide a valid car number, Fails to provide a valid input then display that
     * number is not a valid car number.
     * 
     * Note : The input other than 4 digit positive number[includes negative and 0]
     * is considered as invalid.
     * 
     * Refer the samples, to read and display the data.
     * 
     * Sample Input 1: Enter the car no:1234
     * 
     * Sample Output 1: Lucky Number
     * 
     * Sample Input 2: Enter the car no:1214
     * 
     * Sample Output 2: Sorry its not my lucky number
     * 
     * Sample Input 3: Enter the car no:14
     * 
     * Sample Output 3: 14 is not a valid car number
     */
    public static void main(String[] args) {
        int sum = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the car no:");

        int carNum = sc.nextInt();
        sc.close();
        if (carNum < 1000 || carNum > 9999) {
            System.out.println(carNum + " is not a valid car number");
        } else {
            while (carNum > 0) {
                int n = carNum % 10;
                sum += n;
                carNum = carNum / 10;
            }
            System.out.println(sum);
            if (sum % 3 == 0 || sum % 5 == 0 || sum % 7 == 0) {
                System.out.println("Lucky Number");
            } else {
                System.out.println("Sorry its not my lucky number");
            }
        }
    }
}
