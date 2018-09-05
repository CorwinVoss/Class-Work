
package com.company;

public class Main {

    public static void main(String[] args) {
        Animal myAnimal = new Dog("Lab","yogi", false);
        Dog Fido = new Dog("Lab","Frank",false);

        myAnimal.MakeSound();
        Fido.MakeSound();
    }
}