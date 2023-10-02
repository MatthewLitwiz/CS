package Projects;
import java.util.Scanner;
public class AdvancedCalc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = sc.nextInt();
        System.out.println("Enter 3rd number: ");
        int d = sc.nextInt();


        System.out.println("What would you like to do: ");
        String math = sc.nextLine();

        if (math.equals("add")||(math.equals("+"))) {
            System.out.println(add(a, b, d));
        } else if (math.equals("sub")||(math.equals("-"))) {
            System.out.println(sub(a, b, d));
        } else if (math.equals("*")||(math.equals("multiply")||(math.equals("times")))) {
            System.out.println(multi(a, b, d));
        } else if (math.equals("divide")||math.equals("/")||math.equals("div")) {
            System.out.println(divide(a, b, d));
        } else {
            System.out.println("Invalid Inputs");
        }
        sc.close();
    }
    static int add(int a, int b, int d) {
        return a+b+d;
    }
    static int sub(int a, int b, int d) {
    return a-b-d;
    }
    static int multi(int a, int b, int d) {
        return a*b*d;
    }
    static double divide(double a, double b, int d) {
        return a/b/d;
    }
}
