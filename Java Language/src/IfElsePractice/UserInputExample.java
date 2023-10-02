package IfElsePractice;
import java.util.Scanner;

public class UserInputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter something: ");
        String userInput = scanner.nextLine();

        if (userInput.equals("Hello")) {
            System.out.println("You entered 'Hello'.");
        } else {
            System.out.println("You did not enter 'Hello'.");
        }

        scanner.close();
    }
}
