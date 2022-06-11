import LevelOne.LevelOneMain;
import LevelTwo.LevelTwoMain;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // initializing hero, hero health points, and potions
        String hero = "";
        int heroHealthPoints = 0;
        int heroAttackPoints = 0;
        int potions = 0;

        // new instances of classes
        LevelOneMain levelOne = new LevelOneMain();
        LevelTwoMain levelTwo = new LevelTwoMain();
        Knight knight = new Knight();
        Wizard wizard = new Wizard();
        Ogre ogre = new Ogre();
        Valkyrie valkyrie = new Valkyrie();

        // intro asking user for their name
        String name = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Whats your name?");
        name = scanner.nextLine();
        System.out.println("Hello " + name + ", nice to meet you!");

        // choosing the players hero
        System.out.println(name + ", tell me what type of hero you are, would you be a...");
        System.out.println("a: Noble Knight, balance of health, attack, and magic");
        System.out.println("b: Wise Mage, master of the magic arts but weaker attacks and decent health");
        System.out.println("c: Ogre Warrior, mighty attack and health but without magic");
        System.out.println("d: Winged Valkyrie, powerful vixen of the sky that has a lot of health and potions but little attack power");
        String heroResponse = scanner.nextLine();
        if(heroResponse.equalsIgnoreCase("a")) {
            System.out.println(knight.knight());
            hero = "Knight";
            heroAttackPoints = 100;
            heroHealthPoints = 100;
            potions = 2;
        } else if(heroResponse.equalsIgnoreCase("b")) {
            System.out.println(wizard.wizard());
            hero = "Mage";
            heroAttackPoints = 60;
            heroHealthPoints = 85;
            potions = 5;

        } else if(heroResponse.equalsIgnoreCase("c")) {
            System.out.println(ogre.ogre());
            hero = "Ogre";
            heroAttackPoints = 125;
            heroHealthPoints = 150;
            potions = 0;
        } else if(heroResponse.equalsIgnoreCase("d")) {
            System.out.println(valkyrie.valkyrie());
            hero = "Valkyrie";
            heroAttackPoints = 45;
            heroHealthPoints = 130;
            potions = 3;
        }
        System.out.println("You have chosen to be a " + hero + ", which starts with " +  heroAttackPoints + " attack, and has " + heroHealthPoints + " health points and has " + potions + " potions, go bravely on your quest!!!");

        // asking the player if they are ready to start
        System.out.println(name + " are you ready to start your journey?[y/n]");
        String res = scanner.nextLine();
        if(res.equalsIgnoreCase("y")) {
            levelOne.levelOne(name, hero, heroAttackPoints, heroHealthPoints, potions);
            levelTwo.levelTwo(name);
        } else {
            System.out.println("maybe next time!");
        }

    }
}
