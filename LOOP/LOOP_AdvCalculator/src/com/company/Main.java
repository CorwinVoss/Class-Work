package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter your first number here:");
        String numberInput = scanner1.nextLine();
        int numberInputInt = Integer.parseInt(numberInput);
        System.out.println();
        String operationInput = scanner1.next();
        while (operationInput.equals("Start") || operationInput.equals("start")) {
            System.out.print("Enter your first number:");
            String operationInputNew = scanner1.nextLine();
            int operationInputNewInt = Integer.parseInt(operationInputNew);
            System.out.print("Enter your operator:");

            System.out.print("Enter your second number:");
            String operationInputSecondString = scanner1.nextLine();
            int operationInputSecondInt = Integer.parseInt(operationInputSecondString);
            if (operationInputNew.equals("+")) {
                String numberInputString2 = scanner1.nextLine();
                int numberInputInt2 = Integer.parseInt(numberInputString2);
                numberInputInt = numberInputInt + numberInputInt2;
                System.out.println(numberInputInt);
            }
            if (operationInputNew.equals("-")) {
                String numberInputString2 = scanner1.nextLine();
                int numberInputInt2 = Integer.parseInt(numberInputString2);
                numberInputInt = numberInputInt - numberInputInt2;
            }
            if (operationInputNew.equals("*") || operationInput.equals("x")) {

                operationInputNewInt = operationInputNewInt * operationInputSecondInt;

            }
            if (operationInputNew.equals("/")) {
            }
            if (operationInputNew.equals("C")) {

            } else {
                System.out.print("If you wish to quit type q");
            }
            if (operationInputNew.equals("q") || operationInput.equals("Q")) {
                System.exit(0);
            }
        }
    }
}
