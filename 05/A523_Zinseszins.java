
import java.util.Scanner;

public class A523_Zinseszins {
  public static void main(String[] args) {
    // variables
    double startSum, rate, endSum;
    int years;
    Scanner input = new Scanner(System.in);

    // input
    System.out.print("Bitte geben Sie die Laufzeit für den Vertrag an: ");
    years = input.nextInt();
    System.out.print("Bitte geben Sie an, wie viel Kapital Sie anlegen: ");
    startSum = input.nextDouble();
    System.out.print("Bitte geben Sie den Zinssatz an: ");
    rate = input.nextDouble() / 100;

    endSum = startSum;
    // processing
    for (int i = 0; i < years; i++) {
      endSum = (endSum * (1 + rate));
    }

    // output
    System.out.println("Eingezahltes Kapital: " + startSum + " Euro");
    System.out.println("Ausgezahltes Kapital: " + String.format("%.2f", endSum) + " Euro");

  }
}
