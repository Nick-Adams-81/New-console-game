import java.util.Scanner;

public class LevelOne {

    public void levelOne(String name) {
        boolean confirm;
        Scanner scanner = new Scanner(System.in);
        do {
        System.out.println(name + ", You start your journey at a crossroads, you can go north, south, east, or west, which way will you go?[N/S/E/W]");
        String response = scanner.nextLine();

            if (response.equalsIgnoreCase("N")) {
                System.out.println("North");
            } else if (response.equalsIgnoreCase("S")) {
                System.out.println("south");
            } else if (response.equalsIgnoreCase("E")) {
                System.out.println("east");
            } else if (response.equalsIgnoreCase("W")) {
                System.out.println("West");
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
