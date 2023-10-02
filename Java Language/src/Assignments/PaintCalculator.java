package Assignments;
import java.util.Scanner;

public class PaintCalculator {
    
    public static void main(String[] args){
        Scanner b = new Scanner(System.in);
        System.out.println("What's the height of the room? ");
        int height = b.nextInt();
        System.out.println("Whats the length of the room? ");
        int length = b.nextInt();
        System.out.println("Whats the width of the room? ");
        int width = b.nextInt();
        double wall = length * width * height;
        System.out.println(wall);
        b.close();


    }
}

