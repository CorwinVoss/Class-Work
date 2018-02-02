package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        int a = 0;
        System.out.println("How many numbers do you want to get the sums of?");
        int arraySize = Integer.parseInt(scanner1.nextLine());
        int[] array1 = new int[arraySize];
        int[] array2 = new int[100];
        for (int i = 0; i <= arraySize; i++) {
            System.out.println("Enter a number:");
            array1[i] = Integer.parseInt(scanner1.nextLine());
        }
        for (int j = 1; j < arraySize; j++) {
            a += array1[j];
            for (int i = 0; i < j; i++){
                array2[i] = a;
            }
        }
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] != 0) {
                System.out.println(array2[i]);
            }
        }
    }
}