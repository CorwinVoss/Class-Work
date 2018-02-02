package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("What is the year?");
        Scanner scanner1 = new Scanner(System.in);
        String yearString = scanner1.nextLine();
        int year = Integer.parseInt(yearString);
       if (divisible4(year)){
           if (divisible100(year)){
            if(divisible400(year)){
                System.out.println("The entered year is a leap year.");
            }
            else {
                System.out.println("The entered year is not a leap year.");
            }
           }
           else {
               System.out.println("The entered year is a leap year.");
           }
       }
       else {
           System.out.println("The year you entered is not a leap year.");
       }
    }

    static boolean divisible4(int year) {
        if (year % 4 == 0) {
            return (true);
        } else {
            return (false);
        }
    }

    static boolean divisible100(int year) {
        if (year % 100 == 0) {
            return (true);
        } else {
            return (false);
        }
    }

    static boolean divisible400(int year) {
        if (year % 400 == 0) {
            return (true);
        } else {
            return (false);
        }
    }
}
