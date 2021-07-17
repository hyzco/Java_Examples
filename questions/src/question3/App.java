package question3;

import java.util.Scanner;

public class App {
    /*
     * Question-3
     * 
     * Problem Statement – Aly wants a magic board, which displays a character for a
     * corresponding number for his science project. Help him to develop such an
     * application.
     * 
     * For example when the digits 65,66,67,68 are entered, the alphabet ABCD are to
     * be displayed. [Assume the number of inputs should be always 4 ]
     * 
     * Sample Input 1: Enter the digits: 65 66 67 68
     * 
     * Sample Output 1: 65-A 66-B 67-C 68-D
     * 
     * Sample Input 2: Enter the digits: 115 116 101 112
     * 
     * Sample Output 2: 115-s 116-t 101-e 112-p
     */
    public static void main(String[] args) {
        int maxNumberOfInputs = 4;
        int loopCounter = 0;

        Scanner scanner = new Scanner(System.in);
        Integer[] inputs = new Integer[maxNumberOfInputs];

        System.out.print("Please enter the digits:");
        while (loopCounter < maxNumberOfInputs) {
            inputs[loopCounter] = scanner.nextInt();
            loopCounter++;
        }

        scanner.close();

        if (loopCounter == maxNumberOfInputs) {
            for (Integer integer : inputs) {
                System.out.printf("%d-%C ", integer, (char) (int) integer);
            }
        }
    }
}
