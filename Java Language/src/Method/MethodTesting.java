package Method;
import java.util.Scanner;
public class MethodTesting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Age: ");
        int age = sc.nextInt();
        int time = (add(age));
        System.out.println(time);
        sc.close();

    }
    static int add(int age) {
        return age*12;
    }
    
}
