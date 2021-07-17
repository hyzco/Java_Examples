package question6;

import java.util.Scanner;

public class App {

    /*
     * Problem Statement – Aly’s teacher has asked him to prepare well for the
     * lesson on seasons. When his teacher tells a month, he needs to say the season
     * corresponding to that month. Write a program to solve the above task.
     * 
     * Spring – March to May, Summer – June to August, Autumn – September to
     * November and, Winter – December to February. Month should be in the range 1
     * to 12. If not the output should be “Invalid month”.
     * 
     * Sample Input 1: Enter the month:11
     * 
     * Sample Output 1: Season:Autumn
     * 
     * Sample Input 2: Enter the month:13
     * 
     * Sample Output 2: Invalid month
     */

    /*
     * March April May - Spring June July August - Summer September October November
     * - Autumn December January February - Winter
     */
    public static void main(String[] args) {
        int monthInput = 0;
        String season = "n/A";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the month:");
        monthInput = scanner.nextInt();
        scanner.nextLine();

        if (monthInput >= 1 && monthInput <= 12) {
            if (monthInput >= 3 && monthInput <= 5) {
                season = "Spring";
            } else if (monthInput >= 6 && monthInput <= 8) {
                season = "Summer";
            } else if (monthInput >= 9 && monthInput <= 11) {
                season = "Autumn";
            } else if (monthInput == 12 || (monthInput >= 1 && monthInput <= 2)) {
                season = "Winter";
            }

            System.out.printf("Season: %s \n", season);
        } else {
            System.out.println("Invalid month");
            scanner.close();
            System.exit(0);
        }

        /* Switch case version */

        // switch (monthInput) {
        //     case 12:
        //     case 1:
        //     case 2:
        //         season = "Winter";
        //         System.out.printf("Season: %s \n", season);
        //         break;
        //     case 3:
        //     case 4:
        //     case 5:
        //         season = "Spring";
        //         System.out.printf("Season: %s \n", season);
        //         break;
        //     case 6:
        //     case 7:
        //     case 8:
        //         season = "Summer";
        //         System.out.printf("Season: %s \n", season);
        //         break;
        //     case 9:
        //     case 10:
        //     case 11:
        //         season = "Winter";
        //         System.out.printf("Season: %s \n", season);
        //         break;
        //     default:
        //         System.out.println("Invalid month");
        //         scanner.close();
        // }
    }
}
