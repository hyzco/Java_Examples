package question11;

import java.util.Scanner;

public class App {
    /*
     * Problem Statement –
     * 
     * IIHM institution is offering a variety of courses to students. Students have
     * a facility to check whether a particular course is available in the
     * institution. Write a program to help the institution accomplish this task. If
     * the number is less than or equal to zero display “Invalid Range”.
     * 
     * Assume maximum number of courses is 20.
     * 
     * Sample Input 1:
     * 
     * Enter no of course: 5
     * 
     * Enter course names: Java
     * 
     * Oracle C++ Mysql Dotnet
     * 
     * Enter the course to be searched: C++
     * 
     * Sample Output 1:
     * 
     * C++ course is available
     * 
     * Sample Input 2: Enter no of course: 3
     * 
     * Enter course names: Java
     * 
     * Oracle
     * 
     * Dotnet
     * 
     * Enter the course to be searched: C++
     * 
     * Sample Output 2:
     * 
     * C++ course is not available
     * 
     * Sample Input 3:
     * 
     * Enter no of course: 0
     * 
     * Sample Output 3:
     * 
     * Invalid Range
     */
    public static void main(String[] args) {
        int maxCourseNumber = 20;
        int noOfCourse = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter no of course:");
        noOfCourse = scanner.nextInt();

        int loopCounter = 0;
        if (noOfCourse > 0 && noOfCourse <= maxCourseNumber) {

            String[] courseList = new String[noOfCourse];
            System.out.println("Enter course names:");

            while (loopCounter < noOfCourse) {
                courseList[loopCounter] = scanner.next();
                loopCounter++;
            }

            System.out.print("Enter course to be searched:");
            String courseToBeSearched = scanner.next();
            boolean isAvailable = false;

            for (String course : courseList) {
                if (course.equals(courseToBeSearched)) {
                    isAvailable = true;
                }
            }

            if (isAvailable) {
                System.out.println(courseToBeSearched + " course is available");
            } else {
                System.out.println(courseToBeSearched + " course is not available");
            }

        } else {
            System.out.println("Invalid Range");
            scanner.close();
        }

    }
}