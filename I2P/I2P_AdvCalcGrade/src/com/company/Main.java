package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        String participationPointsString;
        String negativePointsString;
        String contentCompentencyString;
        String workHabitsString;
        System.out.println("Participation points:");
	    participationPointsString = scanner1.next();
	    System.out.println("Negative points:");
	    negativePointsString = scanner1.next();
	    System.out.println("Content compentency:");
        contentCompentencyString = scanner1.next();
        System.out.println("Work Habits:");
        workHabitsString = scanner1.next();
        int participationPointsInt = Integer.parseInt(participationPointsString);
        int negativePointsInt = Integer.parseInt(negativePointsString);
        int contentCompentencyInt = Integer.parseInt(contentCompentencyString);
        int workHabitsInt = Integer.parseInt(workHabitsString);
        double participationPointsDouble = ((2 * participationPointsInt) + (.8 * (100 - negativePointsInt))) * .25;
        double contentCompentencyDouble = contentCompentencyInt * .4;
        double workHabitsDouble = workHabitsInt * .35;
        double grade = participationPointsDouble + contentCompentencyDouble +  workHabitsDouble;
        System.out.printf("Your grade is:" + grade + "%");
    }
}
