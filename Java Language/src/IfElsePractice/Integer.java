package IfElsePractice;
import java.util.Scanner;

public class Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int Entry = sc.nextInt();
        if (Entry == 1) {
            System.out.println("I counted your Entry as 1");
        } else if (Entry == 2) {
            System.out.println("You entered the number 2");
        } else if (Entry == 3) {
            System.out.println("Number three was entered");
        } else {
            System.out.println("You did not enter the number I was looking for");
        }
        sc.close();
    }
}
