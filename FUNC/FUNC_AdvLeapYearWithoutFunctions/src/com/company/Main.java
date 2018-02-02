package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner scanner1 = new Scanner(System.in);
	System.out.println("What is the year?");
	String yearString = scanner1.nextLine();
	int yearInt = Integer.parseInt(yearString);
	if (yearInt % 4 == 0){
	    if (yearInt % 100 == 0){
	        if (yearInt % 400 == 0){
	            System.out.println("The entered year is a leap year.");
            }
            else {
	            System.out.println("The entered year is not a leap year.");

            }
        }
        else {
	        System.out.println("The entered year is leap year.");
        }
    }
    else {
	    System.out.println("The entered year is not a leap year.");
    }
    }
}
