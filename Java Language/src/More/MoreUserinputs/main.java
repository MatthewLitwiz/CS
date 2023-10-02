package More.MoreUserinputs;
import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String name = sc.nextLine();
        System.out.println("Enter a age: ");
        int age = sc.nextInt();
        System.out.println("Enter the weight: ");
        double weight = sc.nextDouble();
        Human human1 = new Human(name,age,weight);
		human1.drink();
		sc.close();

    }
    
}
