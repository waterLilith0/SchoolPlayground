
import java.util.Scanner;

/*
Anzahl an 5 Euro Chips: 2
Anzahl an 10 Euro Chips: 4
Anzahl an 20 Euro Chips: 6
Anzahl an 50 Euro Chips: 8
Anzahl an 100 Euro Chips: 10

Ihr Auszahlungsbetrag beträgt: 1570 Euro.
 */

class A342_Spielbank {
  public static void main(String[] args) {
    // variables
    Scanner input = new Scanner(System.in);
    int euro5, euro10, euro20, euro50, euro100, sum;
    // Eingabe (E)
    System.out.println("Anzahl an 5 Euro Chips: ");
    euro5 = input.nextInt();
    System.out.println("Anzahl an 10 Euro Chips: ");
    euro10 = input.nextInt();
    System.out.println("Anzahl an 20 Euro Chips: ");
    euro20 = input.nextInt();
    System.out.println("Anzahl an 50 Euro Chips: ");
    euro50 = input.nextInt();
    System.out.println("Anzahl an 100 Euro Chips: ");
    euro100 = input.nextInt();
    // Verarbeitung (V)
    sum = euro5 * 5 + euro10 * 10 + euro20 * 20 + euro50 * 50 + euro100 * 100;
    // Ausgabe (A)
    System.out.println("Ihr Auszahlungsbetrag betraegt: " + sum + " Euro.");
  }
}