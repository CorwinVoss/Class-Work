package com.company;

public class Main {

    public static void main(String[] args) {
        first();//1
        first();//2
        first();//3
        first();//4
        first();//5
    }

    static void second() {
        System.out.println("Hello, World");//6
        System.out.println("Hello, World");//7
        System.out.println("Hello, World");//8
        System.out.println("Hello, World");//9

    }

    static void first() {
        second();//10
        second();//11
        second();//12
        second();//13
        second();//14
    }

}


