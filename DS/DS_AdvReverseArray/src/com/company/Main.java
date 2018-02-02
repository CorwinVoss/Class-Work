package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("How many numbers would you like to use;");
        Scanner console = new Scanner(System.in);//dont forget to include Java.utils.Scanner at the top (alt-enter).
        int arraySize = Integer.parseInt(console.nextLine());
        int[] Array = new int[arraySize];
        int tempElement = 0;

        for (int i = 0; i < arraySize; i++) {
            System.out.println("Enter a number.");
            Array[i] = Integer.parseInt(console.nextLine());
        }
        for (int i = Array.length - 1; i >= Array.length / 2; i--) {
            tempElement = Array[i];
            Array[i] = Array[Array.length - i - 1];
            Array[Array.length - i - 1] = tempElement;
        }
        for (int i = 0; i < arraySize; i++) {
            System.out.print(Array[i] + " ");
        }
    }
}
