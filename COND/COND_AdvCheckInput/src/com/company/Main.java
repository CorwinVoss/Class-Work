package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner testNumber = new Scanner(System.in);
        String numberOfTestsString;
        System.out.println("How  many tests do you want to average? (1-5)");
        numberOfTestsString = testNumber.next();
        int numberOfTests = Integer.parseInt(numberOfTestsString);
        if (numberOfTests > 5 || numberOfTests < 0) {
            System.out.println("Invalid number of tests");
        } else {
            System.out.println("Enter your test scores 0-100:");
            if (numberOfTests == 1) {
                String testScore = testNumber.next();
                System.out.println(testScore);
                System.exit(0);
            }
            if (numberOfTests == 2) {
                Scanner testScore = new Scanner(System.in);
                String testScore1 = testScore.next();
                int testScoreInt = Integer.parseInt(testScore1);
                Scanner testScore2 = new Scanner(System.in);
                String testScoreString2 = testScore2.next();
                int testScore2Int = Integer.parseInt(testScoreString2);
                if (testScoreInt > 100 || testScore2Int > 100 || testScoreInt < 0 || testScore2Int < 0) {
                    System.out.println("Invalid test score please try again.");
                } else {
                    //test average
                    double average = (testScoreInt + testScore2Int) / 2.0;
                    System.out.println(average);
                }
            }
            if (numberOfTests == 3) {
                Scanner testScore = new Scanner(System.in);
                String testScoreString1 = testScore.next();
                int testScoreInt = Integer.parseInt(testScoreString1);
                Scanner testScore2 = new Scanner(System.in);
                String testScoreString2 = testScore2.next();
                int testScore2Int = Integer.parseInt(testScoreString2);
                Scanner testScore3 = new Scanner(System.in);
                String testScoreString3 = testScore3.next();
                int testScore3Int = Integer.parseInt(testScoreString3);
                if (testScoreInt < 0 || testScore2Int < 0 || testScore3Int < 0 || testScoreInt > 100 || testScore2Int > 100 || testScore3Int > 100) {
                    System.out.println("Invalid test score please try again.");
                } else {
                    double average = (testScoreInt + testScore2Int) / 3.0;
                    System.out.println(average);
                }
            }
            if (numberOfTests == 4) {
                Scanner testScore = new Scanner(System.in);
                String testScoreString1 = testScore.next();
                int testScoreInt = Integer.parseInt(testScoreString1);
                Scanner testScore2 = new Scanner(System.in);
                String testScoreString2 = testScore2.next();
                int testScore2Int = Integer.parseInt(testScoreString2);
                Scanner testScore3 = new Scanner(System.in);
                String testScoreString3 = testScore3.next();
                int testScore3Int = Integer.parseInt(testScoreString3);
                Scanner testScore4 = new Scanner(System.in);
                String testScoreString4 = testScore4.next();
                int testScore4Int = Integer.parseInt(testScoreString4);
                if (testScoreInt < 0 || testScore2Int < 0 || testScore3Int < 0 || testScore4Int < 0 || testScoreInt > 100 || testScore2Int > 100 || testScore3Int > 100 || testScore4Int > 100) {
                    System.out.println("Invalid test score please try again.");
                } else {
                    double average = (testScoreInt + testScore2Int + testScore3Int + testScore4Int) / 4.0;
                    System.out.println(average);
                }
            } else {
                Scanner testScore = new Scanner(System.in);
                String testScore1 = testScore.next();
                int testScoreInt = Integer.parseInt(testScore1);
                Scanner testScore2 = new Scanner(System.in);
                String testScoreString2 = testScore2.next();
                int testScore2Int = Integer.parseInt(testScoreString2);
                Scanner testScore3 = new Scanner(System.in);
                String testScoreString3 = testScore3.next();
                int testScore3Int = Integer.parseInt(testScoreString3);
                Scanner testScore4 = new Scanner(System.in);
                String testScoreString4 = testScore4.next();
                int testScore4Int = Integer.parseInt(testScoreString4);
                Scanner testScore5 = new Scanner(System.in);
                String testScoreString5 = testScore5.next();
                int testScore5Int = Integer.parseInt(testScoreString5);
                if (testScoreInt < 0 || testScore2Int < 0 || testScore3Int < 0 || testScore4Int < 0 || testScore5Int < 0 || testScoreInt > 100 || testScore2Int > 100 || testScore3Int > 100 || testScore4Int > 100 || testScore5Int > 100) {
                    System.out.println("Invalid test score please try again.");
                } else {
                    double average = (testScoreInt + testScore2Int + testScore3Int + testScore4Int + testScore5Int) / 5.0;
                    System.out.println(average);
                }
            }
        }
    }
}
