package LevelOne;

import java.util.Scanner;

public class West {

    public void west(String name, String hero, int heroAttackPoints, int heroHealthPoints, int potions) {

        Witch witch = new Witch();
        Scanner scanner = new Scanner(System.in);

        System.out.println(name + ", heading to the eternal land of the West holds promise, but don't be fooled by it's allure, there is much danger ahead...");
        System.out.println(hero + " " + heroHealthPoints + " " + heroAttackPoints + " " + potions);
        System.out.println("You see a friendly sprite along your journey west, as you approach the sprite tells you she can help you with your quest! \ncome closer to get your bonus!");
        System.out.println("As you approach the sprite you realize......");
        System.out.println("it's a trap!!! you fall into a deep pit and the sprite tells you have two options to get out");
        System.out.println("a: you give up one potion");
        System.out.println("b: you give up 25% of your health");
        String response = scanner.nextLine();
        if (response.equalsIgnoreCase("a") && potions > 0) {
            potions--;
            System.out.println("you have chosen to give up a potion, you now have " + potions + " potions");
        } else if (response.equalsIgnoreCase("a") && potions == 0) {
            heroHealthPoints -= (heroHealthPoints / 3);
            System.out.println("You have no potions to surrender, you will now lose 33% of your health for your dirty trick!");
            System.out.println("Your health is now " + heroHealthPoints);
        } else if (response.equalsIgnoreCase("b")) {
            System.out.println(heroHealthPoints );
            heroHealthPoints -= (heroHealthPoints / 4);
            System.out.println("You have surrendered 25% of your health, your health is now " + heroHealthPoints);
        } else {
            System.out.println("please input either a or b...");
        }
        if (hero.equalsIgnoreCase("Valkyrie")) {
            System.out.println(witch.wickedWitch());
            System.out.println("I'll get you, my pretty, and your little dog, too!!!");
        }
    }
}
