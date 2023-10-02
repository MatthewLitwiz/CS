package More.Guests;
import java.util.Scanner;
public class EventDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Event event = new Event();
        System.out.println("Enter Event Number: ");
        String eventNumber = sc.nextLine();
        System.out.println("How many guest does your event have: ");
        int guest = sc.nextInt();

        System.out.println("Your first event details:");
        displayDetails(event);

        System.out.println("Your second event details:");
        Event event1 = new Event(eventNumber, guest);
        displayDetails(event1);
        sc.close();


    }
    public static void displayDetails(Event event) {
        System.out.println("You have " + event.getguestlist() + " guest");
        System.out.println("Which comes to total price of $" + event.getprice());
    }
    
}
