package More.UserInputs;
import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("What should the person do? [move, sit, eat, sleep, work, workout] ");
        String action = sc.nextLine();
        human person = new human(action);
        if (action.equals("move")){
            System.out.println("Your character has moved.");
        } else if (action.equals("sit")){
            System.out.println("Your character has sat down.");
        } else if (action.equals("work")){
            System.out.println("Your character is currently working.");
        } else if (action.equals("sleep")){
            System.out.println("Your character is currently sleeping.");
        } else if (action.equals("eat")){
            System.out.println("Your character is now full");
        } else if (action.equals("workout")){
            System.out.println("Your character is currently excercising.");
    } else {
        System.out.println("Invalid Input");
    }

    sc.close();
    
}
}
