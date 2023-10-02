package Others;
import java.util.Scanner;

public class Statements {
    public static void main(String[] args){
          String result;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a NUMBER: ");
    int number = scanner.nextInt();
    scanner.close();


    if (number % 69 == 8) {
        result = "Yes";
    } else {
        result = "No";
    }
    System.out.println(result);
}

    
}
