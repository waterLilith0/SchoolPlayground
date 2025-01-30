// Miriam Fix

import java.util.Scanner;

class A624_Urlaub {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double budget, reserve;
    double conversionRate;
    String currencyName;
    boolean travelBankFull = true;
    System.out.print("Geben Sie Ihr gesamtes Reisebudget an: ");
    budget = input.nextDouble();
    reserve = budget * 0.1;
    System.out.printf("Ihre Reserve beträgt: " + reserve + " Euro");

    
    while(travelBankFull) {
      System.out.println("\n\nWelches Land wollen Sie auswählen?\r\n" + //
                "D: Dänemark\r\n" + //
                "E: England\r\n" + //
                "J: Japan\r\n" + //
                "S: Schweiz\r\n" + //
                "U: USA");
      String choiceString = input.next();
      char choice = choiceString.toLowerCase().charAt(0);
      switch (choice) {
          case 'd':
            conversionRate = 7.44;
            currencyName = "DKK (Kronen)";
            break;
          case 'e':
            conversionRate = 0.88;
            currencyName = "GBP (Pfund)";
            break;
          case 'j':
            conversionRate = 141;
            currencyName = "JPY (Yen)";
            break;
          case 's':
            conversionRate = 0.96;
            currencyName = "CHF (Franken)";
            break;
          case 'u':
            conversionRate = 0.98;
            currencyName = "USD (Dollar)";
            break;
          default:
            conversionRate = 1;
            currencyName = "n/a";
            System.out.println("Not a valid input, please try again!");
            choice = input.next().charAt(0);
      }

        System.out.println("Wie viele Euros wollen Sie umwechseln? ");
        double toDeduct = input.nextDouble();

      }
      input.close();
    }
}