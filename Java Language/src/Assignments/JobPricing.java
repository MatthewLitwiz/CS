package Assignments;
import java.util.Scanner;
public class JobPricing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your job name: ");
        String jobName = sc.nextLine();
        System.out.println("Enter the cost of material: ");
        int cost = sc.nextInt();
        System.out.println("Enter the number of hours worked: ");
        double amount = sc.nextDouble();
        System.out.println("Enter your travel time: ");
        double travelTime = sc.nextDouble();
        sc.close();

        System.out.println("Hello you worked at " + jobName + " and earned " + getCost(cost, amount, travelTime));


    }
    public static double getCost(int cost, double amount, double travelTime) {
        return cost + (35 * amount) + (travelTime * 12);

    }
    
}
