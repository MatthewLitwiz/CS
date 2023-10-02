package Assignments;
import java.util.Scanner;

public class YummyEventPrice {
    public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
    System.out.println("How many guest are there? ");
    int guestCount = scanner.nextInt();
    int a = guestCount * 35;
    scanner.close();
    System.out.println("{*********************************************************}");
    System.out.println("{                                                         }");
    System.out.println("{          Yummy Low Priced Guest Event                   }");
    System.out.println("{                 Join us Today!                          }");
    System.out.println("{                 $35 per guest                           }");
    System.out.println("{                                                         }");
    System.out.println("{                                                         }");
    System.out.println("{*********************************************************}");
    System.out.println("There are " + guestCount + " guests, totaling $" + a + " dollars");
    boolean b = guestCount > 50;
    System.out.println(b);

    }
}
