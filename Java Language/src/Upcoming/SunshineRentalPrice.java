package Upcoming;
import java.util.Scanner;

public class SunshineRentalPrice {
    public static void main(String[] args){
    Scanner scanner = new Scanner (System.in);
    System.out.println("Minutes rented:" );
    double rented = scanner.nextDouble();
    double hours = rented / 60;
    double minutes = rented % 60;
    double total = hours * 40 + minutes * 1;
    System.out.println("You rented it for " + hours + " hours and " + minutes + " minutes for a total of " + total);



    scanner.close();


    }
}
