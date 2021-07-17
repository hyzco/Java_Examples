package question9;

import java.util.Scanner;

public class App {
    /*
     * Question-9 XYZ Technologies is in the process of increment the salary of the
     * employees. This increment is done based on their salary and their performance
     * appraisal rating.
     * 
     * If the appraisal rating is between 1 and 3, the increment is 10% of the
     * salary.
     * 
     * If the appraisal rating is between 3.1 and 4, the increment is 25% of the
     * salary.
     * 
     * If the appraisal rating is between 4.1 and 5, the increment is 30% of the
     * salary.
     * 
     * Help them to do this, by writing a program that displays the incremented
     * salary. Write a class “IncrementCalculation.java” and write calculate() method and set a getter to get calculated salary.
     * 
     * Note : If either the salary is 0 or negative (or) if the appraisal rating is
     * not in the range 1 to 5 (inclusive), then the output should be “Invalid
     * Input”.
     * 
     * Sample Input 1 :
     * 
     * Enter the salary 8000
     * 
     * Enter the Performance appraisal rating 3
     * 
     * Sample Output 1 :
     * 
     * 8800
     * 
     * Sample Input 2 :
     * 
     * Enter the salary 7500
     * 
     * Enter the Performance appraisal rating 4.3
     * 
     * Sample Output 2 :
     * 
     * 9750
     * 
     * Sample Input 3 :
     * 
     * Enter the salary -5000
     * 
     * Enter the Performance appraisal rating 6
     * 
     * Sample Output 3 :
     * 
     * Invalid Input
     */
    public static void main(String[] args) {
        double appraisalRate;
        int salary;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the salary: ");
        salary = scanner.nextInt();

        System.out.print("Enter the Performance appraisal rating: ");
        appraisalRate = scanner.nextDouble();

        scanner.close();

        if (salary < 1 || appraisalRate < 1.0 || appraisalRate > 5.0) {
            System.out.println("Invalid Input");
            System.exit(0);
        }

        IncrementCalculation IC = new IncrementCalculation(appraisalRate, salary);
        IC.calculate();
        int calculatedSalary = IC.getCalculatedSaray();
        System.out.println(calculatedSalary);
    }
}
