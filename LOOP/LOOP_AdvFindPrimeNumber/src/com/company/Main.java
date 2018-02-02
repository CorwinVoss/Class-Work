package com.company;

import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        String firstNumberInput = scanner1.next();
        int firstNumberInt = Integer.parseInt(firstNumberInput);
        System.out.print("Enter your second number: ");
        String secondNumberInput = scanner1.next();
        int secondNumberInt = Integer.parseInt(secondNumberInput);
        int i = 2;
        if (firstNumberInt < secondNumberInt) {

            while (firstNumberInt != secondNumberInt) {

                System.out.println();
            }
        } else {

                while (secondNumberInt != firstNumberInt){

                    System.out.println();
                }
         }
    }
}