package LevelOne;

import java.util.Scanner;

public class East {

    public void east(String name, String hero, int heroHealthPoints, int potions) {
        Scanner scanner = new Scanner(System.in);


        System.out.println(name + ", heading east may be dangerous, be very careful on your journey!");
        System.out.println("You encounter your fist adversary, he casts a spell on your primary weapon that limits your attack power from 10 to 50! He demands battle!!! Do you accept?[Y/N]");
        String response = scanner.nextLine();
        System.out.println("ready to attack?[Y/N]");

        if(response.equalsIgnoreCase("y")) {
            boolean attack;

            do {
                int enemyAttackPoints = RandomInt.randomInt(5, 20);
                int enemyHealthPoints = 85;
                int heroAttackPoints = RandomInt.randomInt(10, 50);

                enemyHealthPoints -= heroAttackPoints;
                heroHealthPoints -= enemyAttackPoints;

                System.out.println("You attack and deal " + heroAttackPoints + " to your enemy, leaving him with " + enemyHealthPoints + ", he counter attack you, dealing " + heroHealthPoints + ", leaving you with " + heroHealthPoints);

                if(heroHealthPoints <= 0) {
                    System.out.println(name + " you died!");
                } else if(enemyHealthPoints <= 0) {
                    System.out.println(name + " You have defeated you adversary!");
                }
                System.out.println("What do you want to do now?");
                System.out.println("a: continue the attack");
                System.out.println("b: Take a potion");
                String res = scanner.nextLine();
                if(res.equalsIgnoreCase("b")) {
                    if(potions > 0) {
                        heroHealthPoints += 10;
                        potions--;
                    }
                }

                attack = res.equalsIgnoreCase("a") || res.equalsIgnoreCase("b");
            } while(attack);
        } else {
            heroHealthPoints -= (heroHealthPoints / 2);
            System.out.println("Your cowardice will cost you 50% of your health! it is now " + heroHealthPoints);
        }

    }
}
