package question1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    /*
     * Problem Statement – Write a program to calculate the fuel consumption of your
     * truck.The program should ask the user to enter the quantity of diesel to fill
     * up the tank and the distance covered till the tank goes dry.Calculate the
     * fuel consumption and display it in the format (liters per 100 kilometers).
     * 
     * Convert the same result to the U.S. style of miles per gallon and display the
     * result. If the quantity or distance is zero or negative display ” is an
     * Invalid Input”.
     * 
     * [Note: The US approach of fuel consumption calculation (distance / fuel) is
     * the inverse of the European approach (fuel / distance ). Also note that 1
     * kilometer is 0.6214 miles, and 1 liter is 0.2642 gallons.]
     * 
     * The result should be with two decimal place.To get two decimal place refer
     * the below-mentioned print statement :
     * 
     * float cost=670.23;
     * 
     * System.out.printf(“You need a sum of Rs.%.2f to cover the trip”,cost);
     */
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner scanner = new Scanner(System.in);

        double liters = 0d, gallons = 0d;
        double km = 0d, miles = 0d;

        double costPerLiter = 18.54;
        double costPerGallon = 3.7854 * costPerLiter;

        System.out.print("Please enter liters of diesel to fill up the tank: ");
        liters = scanner.nextInt() * 1.00;

        if (liters < 0) {
            System.out.printf("%s is invalid format", new DecimalFormat("0").format(liters));
            System.exit(0);
        }

        System.out.print("Please enter km till the tank goes dry: ");
        km = scanner.nextInt() * 1.00;

        if (km < 0) {
            System.out.printf("%s is invalid format", new DecimalFormat("0").format(km));
            System.exit(0);
        }

        scanner.close();
        gallons = liters * 0.2642;
        miles = km * 0.6214;

        System.out.printf("Liters/100KM:  %s - cost (1L): %s  - cost (100KM): %s \n", df.format(((liters / km) * 100)),
                df.format((liters * costPerLiter) / liters),
                df.format(((liters / km) * 100) * (liters * costPerLiter) / liters));
        System.out.printf("Miles/Gallons: %s - cost (per gallon): %s",
                df.format((miles / gallons)), df.format(costPerGallon));
    }
}