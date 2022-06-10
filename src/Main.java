import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // setting up hero health points
        String hero = "";
        int heroHealthPoints = 0;
        int heroAttackPoints = 0;
        int potions = 0;

        // new instances of classes

        LevelOne levelOne = new LevelOne();
        LevelTwo levelTwo = new LevelTwo();

        // intro asking user for their name
        String name = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Whats your name?");
        name = scanner.nextLine();
        System.out.println("Hello " + name + ", nice to meet you!");
        System.out.println(name + ", tell me what type of hero you are, would you be a...");
        System.out.println("a: Noble Knight, balance of health, attack, and magic");
        System.out.println("b: Wise Mage, master of the magic arts but weaker attacks and decent health");
        System.out.println("c: Powerful warrior, mighty attack and health but without magic");
        String heroResponse = scanner.nextLine();
        if(heroResponse.equalsIgnoreCase("a")) {
            hero = "Knight";
            heroAttackPoints = 100;
            heroHealthPoints = 100;
            potions = 1;
        } else if(heroResponse.equalsIgnoreCase("b")) {
            hero = "Mage";
            heroAttackPoints = 60;
            heroHealthPoints = 85;
            potions = 3;

        } else if(heroResponse.equalsIgnoreCase("c")) {
            hero = "warrior";
            heroAttackPoints = 125;
            heroHealthPoints = 150;
            potions = 0;
        }
        System.out.println("You have chosen to be a " + hero + ", which starts with " +  heroAttackPoints + " attack, and has " + heroHealthPoints + " health points and holds " + potions + " potions, go bravely on your quest!!!");


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
