
import java.util.Scanner;

/*
Einzahlung in Euro: 100000
Zinsen in Prozent: 4
Jahre: 10

Der Investor hat insgesamt 140000.0 Euro erhalten
Der Investor hat insgesamt 148024.42849183443 Euro erhalten (mit Zinseszins)
*/
class A343_Zinsen {
  public static void main(String[] args) {
    // variables
    int investments, years;
    double interest, resultInterest = 0, resultInterestOfInterest = 0;
    Scanner input = new Scanner(System.in);
    
    // Eingabe (E)
    System.out.print("Einzahlung in Euro: ");
    investments = input.nextInt();
    System.out.print("\nZinsen in Prozent: ");
    interest = input.nextDouble();
    System.out.print("\nJahre: ");
    years = input.nextInt();

    // Verarbeitung (V) Anfangskapital * (1 + Zinssatz / 100)^Jahre
    resultInterest = investments * (1 + interest * years / 100);
    resultInterestOfInterest = investments * Math.pow((1 + interest / 100), years);
    
    // Ausgabe (A)
    System.out.println("Der Investor hat insgesamt " + resultInterest + " Euro erhalten");
    System.err.println("Der Investor hat insgesamt " + resultInterestOfInterest + " Euro erhalten (mit Zinseszins)");
  }
}