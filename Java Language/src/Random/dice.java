package Random;
import java.util.Random;
public class dice {
    public static void main(String[] args) {
        Random random = new Random();
        int dice = random.nextInt();
        // double x = random.nextDouble();
        // boolean y = random.nextBoolean();
        System.out.println(dice);

    }
    
}
