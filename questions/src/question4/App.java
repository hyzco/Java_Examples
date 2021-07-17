package question4;

import java.util.HashMap;
import java.util.Scanner;

public class App {
    /*
     * Problem Statement –
     * 
     * HYZCode college wants to recognize the department which has succeeded in
     * getting the maximum number of placements for this academic year. The
     * departments that have participated in the recruitment drive are CSE,ECE,
     * MECH.
     * 
     * Help the college find the department getting maximum placements. Check for
     * all the possible output given in the sample snapshot
     * 
     * Note : If any input is negative, the output should be “Input is Invalid”. If
     * all department has equal number of placements, the output should be “None of
     * the department has got the highest placement”.
     * 
     * Sample Input 1: Enter the no of students placed in CSE:90 Enter the no of
     * students placed in ECE:45 Enter the no of students placed in MECH:70
     * 
     * Sample Output 1: Highest placement CSE
     * 
     * Sample Input 2: Enter the no of students placed in CSE:55 Enter the no of
     * students placed in ECE:85 Enter the no of students placed in MECH:85
     * 
     * Sample Output 2: Highest placement ECE MECH
     * 
     * Sample Input 3: Enter the no of students placed in CSE:0 Enter the no of
     * students placed in ECE:0 Enter the no of students placed in MECH:0
     * 
     * Sample Output 3: None of the department has got the highest placement
     * 
     * Sample Input 4: Enter the no of students placed in CSE:10 Enter the no of
     * students placed in ECE:-50 Enter the no of students placed in MECH:40
     * 
     * Sample Output 4: Input is Invalid
     */
    public static void main(String[] args) {
        String[] departments = { "CSE", "ECE", "MECH" };
        HashMap<String, Integer> collegeMap = new HashMap<>();

        Scanner userInput = new Scanner(System.in);

        int loopCounter = 0, numberOfStudent = 0;

        while (loopCounter < departments.length) {
            System.out.printf("Enter the number of students placed in %s:", departments[loopCounter]);
            numberOfStudent = userInput.nextInt();

            if (numberOfStudent < 0) {
                System.out.println("Input is invalid..");
                userInput.close();
                System.exit(0);
            }

            collegeMap.put(departments[loopCounter], numberOfStudent);
            loopCounter++;
        }

        System.out.println("\n**********************************************");

        int CSE = 0,ECE = 0,MECH = 0;

        if (loopCounter == departments.length) {
                for (String hashKey : collegeMap.keySet()) {

                    int value = collegeMap.get(hashKey);
                    if(hashKey == "CSE"){
                        CSE = value;
                    }else if(hashKey == "ECE"){
                        ECE = value;
                    }else if(hashKey == "MECH"){
                        MECH = value;
                    }
                }
            
                if(CSE == ECE && ECE == MECH && MECH == CSE){
                    System.out.println("None of the department has got the highest placement");
                }else if(CSE > ECE && CSE > MECH){
                    System.out.println("Highest placement CSE");
                }else if(ECE > CSE && ECE > MECH){
                    System.out.println("Highest placement ECE");
                }else if(MECH > ECE && MECH > CSE){
                    System.out.println("Highest placement MECH");
                }else if(CSE == ECE && CSE > MECH){
                    System.out.println("Highest placement CSE ECE");
                }else if(MECH == CSE && MECH > ECE){
                    System.out.println("Highest placament CSE MECH");
                }else if(ECE == MECH && ECE > CSE){
                    System.out.println("Highest placamane ECE MECH");
                }
        }
    }
}
