package Advanced;
import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter which operator to carry out");
        char choice = sc.next().charAt(0);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Calculator ob = new Calculator();
        int output = 0;
        sc.close();
        
        switch (choice) {
            case '+':
                output = ob.add(a, b);
                System.out.println(output);
                break;
            case '-':
                output = ob.sub(a, b);
                System.out.println(output);
                break;
            case '*':
                output = ob.multi(a, b);
                System.out.println(output);
                break;
            case '/':
                output = ob.div(a, b);
                System.out.println(output);
                break;
            case '%':
                output = ob.percentage(a, b);
                System.out.println(output + "%");
                break;

            default:
                System.out.println("Invalid input please use one of the following math signs (+, -, *, /, %)");
        }
    }

    public int add(int a, int b) {
        return (a + b);
    }
    public int sub(int a, int b) {
        return (a - b);
    }
    public int multi(int a, int b) {
        return (a * b);
    }
    public int div(int a, int b){
        return a/b;
    }
    public int percentage(int a, int b){
        return (a/b*100);
    }
}