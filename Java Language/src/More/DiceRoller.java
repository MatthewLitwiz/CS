package More;

import java.util.Random;

class Dice {
    int sides;

    // Constructor with a parameter for the number of sides
    public Dice(int sides) {
        this.sides = sides;
    }

    public int roll() {
        Random rand = new Random();
        return rand.nextInt(sides) + 1;
    }
}

public class DiceRoller {
    public static void main(String[] args) {
        // Create a six-sided dice
        Dice sixSidedDice = new Dice(6);

        // Roll the dice multiple times
        for (int i = 0; i < 5; i++) {
            int result = sixSidedDice.roll();
            System.out.println("Roll " + (i + 1) + ": " + result);
        }
    }
}