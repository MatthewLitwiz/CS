package Random;
import java.util.Scanner;
import java.util.Random;
public class DiceRoll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("How many sided dice would you like to roll: ");
        int numberOfSided = sc.nextInt();
        int dice = random.nextInt(numberOfSided)+1;
        System.out.println("You rolled a "+dice);
        sc.close();

    }
    
}
