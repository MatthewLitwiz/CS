package Upcoming;
import java.util.Scanner;

public class temperature {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the temperature is it in Fahrenheit: ");
        double temperature = scanner.nextDouble();
        double celsius = ((5 * (temperature - 32)) / 9);
        String F = "\u00B0";
        System.out.println(temperature + F + "F" + " is equal to " + celsius + " celsius");
        scanner.close();
    }
    
}
