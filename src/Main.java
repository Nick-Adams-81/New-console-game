import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // setting up hero health points
        int heroHealthPoints = 100;

        // new instances of classes

        LevelOne levelOne = new LevelOne();
        LevelTwo levelTwo = new LevelTwo();

        // intro asking user for their name
        String name = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Whats your name?");
        name = scanner.nextLine();
        System.out.println("Hello " + name + ", nice to meet you!");

        System.out.println(name + " do you want to play a game?[y/n]");
        String res = scanner.nextLine();
        if(res.equalsIgnoreCase("y")) {
            levelOne.levelOne(name);
            levelTwo.levelTwo(name);
        } else {
            System.out.println("maybe next time!");
        }




    }
}
