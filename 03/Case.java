
import java.util.Scanner;

/*
 * asks for user input, depending on input will output a certain number, else error
 */
public class Case {
  

  public static void main(String[] args) {
    // variables
    Scanner input = new Scanner(System.in);
    int choice = 0;

    // input
    System.out.println("Enter a number: ");
    try {
      choice = input.nextInt();
    } catch (Exception e) {
      System.out.println("Not an integer! Please only input a number");
    }

    // else-if
    if (choice == 1) {
      System.out.println("Guten Morgen!");
    } else if (choice == 2) {
      System.out.println("Guten Mittag!");
    } else if (choice == 3) {
      System.out.println("Guten Abend!");
    } else {
      System.out.println("Please only enter a 1, 2 or 3!");
    }

    // switch case
    switch(choice) {
      case 1:
      System.out.println("Guten Morgen!");
      break;
      case 2:
      System.out.println("Guten Mittag!");
      break;
      case 3:
      System.out.println("Guten Abend!");
      break;
      default:
      System.out.println("Please only enter a 1, 2 or 3!");
    }
  }
}
