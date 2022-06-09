import Directions.East;
import Directions.North;
import Directions.South;
import Directions.West;

import java.util.Scanner;

public class LevelOne {

    public void levelOne(String name) {
        North north = new North();
        South south = new South();
        East east = new East();
        West west = new West();

        boolean confirm;
        Scanner scanner = new Scanner(System.in);
        do {
        System.out.println(name + ", You start your journey at a crossroads, you can go north, south, east, or west, which way will you go?[N/S/E/W]");
        String response = scanner.nextLine();

            if (response.equalsIgnoreCase("N")) {
                north.north(name);
            } else if (response.equalsIgnoreCase("S")) {
                south.south(name);
            } else if (response.equalsIgnoreCase("E")) {
                east.east(name);
            } else if (response.equalsIgnoreCase("W")) {
                west.west(name);
            } else {
                System.out.println("please enter a valid response");
            }
            System.out.println("try again?[y/n]");
            String res = scanner.nextLine();
            if(res.equalsIgnoreCase("Y")) {
                confirm = true;
            } else {
                confirm = false;
                System.out.println("Thanks for playing!");
            }

        } while(confirm);

    }
}
