import java.util.Scanner;

public class Intro {

    public void intro() {
        // instance of a new scanner class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Whats your name?");
        String userInput = scanner.nextLine();
        System.out.println("Hello " + userInput + ", nice to meet you!");

    }
}
