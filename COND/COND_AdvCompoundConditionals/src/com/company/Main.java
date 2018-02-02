package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("What is your age?");
        String age;
        int group;
        String firstInitial;
        Scanner ageInput = new Scanner(System.in);
        age = ageInput.next();
        int ageInt = Integer.parseInt(age);
        System.out.println("What is your first initial?");
        Scanner firstInitialInput = new Scanner(System.in);
        firstInitial = firstInitialInput.next();
        int firstInitialInt = String.valueOf(firstInitial).charAt(0);
        if (firstInitialInt == 65 || firstInitialInt == 69 || firstInitialInt == 73 || firstInitialInt == 79 || firstInitialInt == 85 || firstInitialInt == 97 || firstInitialInt == 101 || firstInitialInt == 105 || firstInitialInt == 111 || firstInitialInt == 117) {
            if (ageInt < 20) {
                group = 1;
            }

            else {
                group = 3;
            }
        }
        else{
            if (ageInt < 20){
                group = 2;
            }
            else {
                group = 4;
            }
        }
        System.out.println("Your group is: " + group);
    }
}