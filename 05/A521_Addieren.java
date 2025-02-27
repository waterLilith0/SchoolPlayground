
import java.util.Scanner;

public class A521_Addieren {
  public static void main(String[] args) {
    // variables
    int num1, result = 0;
    Scanner input = new Scanner(System.in);

    // input
    System.out.println("Bitte geben Sie eine Zahl ein: ");
    num1 = input.nextInt();

    // processing
    /*
    for (int i = 1; i <= num1; i++) {
      result += i;
    }
    */

    /*
    int i = 1;
    while(i <= num1) {
      result += i;
      i++;
    }
    */

    int i = 1;
    do { 
      result += i;
      i++;
    } while (i <= num1);

    // output
    System.out.println("Die Summe ist: " + result + ".");

  }
}
