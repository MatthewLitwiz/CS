package Method;
import java.util.Scanner;
public class methodCaul {

	public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a number 1:x >> ");
        int num1 = kb.nextInt();
        System.out.println("Enter a number 2:y >> ");
        int num2 = kb.nextInt();

        doubleparameter(num1, num2);
        kb.close();

    }

    public static void doubleparameter(int x, int y) {
        System.out.println("Addition is: " + (x+y));
        System.out.println("Subtraction is: " + (x-y));
        System.out.println("Multiplication is: " + (x*y));
        System.out.println("Division is: " + (x/y));
    }
}
