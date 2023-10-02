package Assignments;
import java.util.Scanner;

public class BookstoreCredit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your grade point average: ");
        double average = scanner.nextDouble();
        double credit = reward(average);
        StudentInfo(name, average, credit);


        scanner.close();
    }
    public static double reward(double average) {
        return average * 10;

    }
    public static void StudentInfo(String name, double average, double credit) {
        System.out.println("Hello " + name + ", your grade point average is " + average);
        System.out.println("Congrats! you recieved " + credit + " credit reward for your grade point average");
    }

}

