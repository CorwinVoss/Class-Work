package com.company;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Main {
    private static String name;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name");
        String name = scanner.nextLine();
        Character character = new Character();
        character.name = name;
        int maxExp = character.playerLevel * 1200;
        Area area = new Area();
        ArrayList<String> promptList = new ArrayList<>();


        promptList.add("You hear a snake and run away"); // 0
        promptList.add("You literally take candy from a baby"); // 1
        promptList.add("You go for a run"); // 2
        promptList.add("You eat some food"); // 3
        promptList.add("You drink a potion"); // 4
        promptList.add("You find food but it looks a little old... You decide to eat it anyways"); // 5

        while (character.health < 0) {
            if (character.playerExp == maxExp){
               character.LevelUp(character.playerLevel);
            }
            Random random = new Random();
            int randomInt = random.nextInt();
            int randomInt2 = random.nextInt();
            switch (randomInt2) {
                case 1:
                    area = new JungleArea();
                    System.out.println("You are in the " + area.type);
            }

            System.out.println("You found a(n) " + area.enemyEncounter().name);

            switch ( randomInt) {
                case 1:
                    promptList.get(0);
                    System.out.println("Exp - 5!");
                    character.playerExp -= 5;

                case 2:
                    promptList.get(1);
                    System.out.println("Exp + 5!");
                    character.playerExp += 5;

                case 3:
                    promptList.get(2);
                    System.out.println("Exp + 5 and Health + 1");
                    character.Heal(1);
                    character.playerExp += 5;

                case 4:
                    promptList.get(3);
                    System.out.println("Health + 2");
                    character.Heal(2);

                case 5:
                    promptList.get(4);
                    System.out.println("Health + 5");
                    character.Heal(5);

                case 6:
                    promptList.get(5);
                    System.out.println("Health - 2");
                    character.Heal(-2);
            }
        }
    }
}