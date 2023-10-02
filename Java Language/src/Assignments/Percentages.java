package Assignments;
import java.util.Scanner;

public class Percentages {
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    double a = sc.nextDouble();
    System.out.println("Enter another number: ");
    double b = sc.nextDouble();
    sc.close();

    System.out.println(a + " is " +percentage(a, b) + "% 10 percent of " + b);
    System.out.println(b + " is " +percentage(b, a) + "% 10 percent of " + a);

    
}
public static double percentage(double a, double b) {
    return a / b*100;
}
public static double percentage2(double b, double a) {
    return b / a*100;
}
}
