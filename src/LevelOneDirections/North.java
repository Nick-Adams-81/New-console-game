package LevelOneDirections;

import java.util.Scanner;

public class North {
    int guesses = 3;

    public void north(String name, String hero, int heroHealthPoints, int heroAttackPoints, int potions) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(name + ", you have decided to go north");
        System.out.println(name + " " + hero + " " + heroHealthPoints + " " + heroAttackPoints + " " + potions);
        System.out.println("You travel north through a dense forest, you arrive upon a little man with a funny cap, he tells you he can increase your health and attack if you can answer his riddle in three guesses or less, \nbut if you can not answer it correctly it will take away from your attack and health, there is no turning back so guess well!");
        System.out.println("The strange little man asks his riddle: \nWhat is Black and White and Red all over?");
        String response;
        do {
             response = scanner.nextLine();
            if (response.equalsIgnoreCase("newspaper")) {
                heroHealthPoints += 20;
                heroAttackPoints += 20;
                System.out.println("Correct! your health is now: " + heroHealthPoints + ", and your attack is now: " + heroAttackPoints + ", good luck on your journey!");
                break;
            } else {
                guesses--;
                System.out.println("incorrect, you have " + guesses + " guesses left");
            }

        } while (guesses > 0);
        if (guesses == 0) {
            heroHealthPoints -= 15;
            heroAttackPoints -= 15;
            System.out.println("incorrect! your health is now:" + heroHealthPoints + ", and your attack is now:" + heroAttackPoints + ", better luck on the rest of your journey!");
        }

    }
}

