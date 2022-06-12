package LevelOne;

import java.util.Scanner;

public class South {

    public void south(String name, String hero, int heroAttackPoints, int heroHealthPoints, int potions) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(name + ", you have chosen to go south");
//        System.out.println(name + " " + hero + " " + heroHealthPoints + " " + heroAttackPoints + " " + potions);
        System.out.println("While heading south you come across a man flipping a coin, you approach and ask why hes flipping a coin alone, he responds...\n i've been waiting on you, I can help you on your journey, friendo, he then flips the coin and says 'call it', you ask 'what am I calling it for?' The man replies 'everything', \nyou tell the man you need to know what your calling it for or you won't call it, he says 'just call it, I can't call it for you'");
        System.out.println("h: heads");
        System.out.println("t: tails");
        int heads = 1;
        int tails = 2;
        int flip = 0;
        String response = scanner.nextLine();
        if(response.equalsIgnoreCase("h")) {
            flip = heads;
        } else if(response.equalsIgnoreCase("t")) {
            flip = tails;
        } else {
            System.out.println("pleasse enter either H or T");
        }
        int coinFlip = RandomInt.randomInt(1, 3);
        System.out.println(flip + " " + coinFlip);

    }
}
