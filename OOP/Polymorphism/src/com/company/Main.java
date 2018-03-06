
package com.company;

public class Main {

    public static void main(String[] args) {
        Animal myAnimal = new Animal("Bear","yogi");
        Dog Fido = new Dog("Lab","Frank",false);


        myAnimal.MakeSound();
        Fido.MakeSound();
    }
}