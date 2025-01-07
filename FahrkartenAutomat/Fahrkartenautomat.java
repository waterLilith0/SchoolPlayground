/**
 * Fahrkartenautomat Übungsprojekt
 * @author Miriam Fix (FI-B 46)
 * @version A2.6 Fahrkartenautomat kommentieren
 * A4.3: Ticketgrenzen im Fahrkartenautomat
 * A5.3: Wiederholung der Eingabe der Ticketanzahl 
 */

import java.util.InputMismatchException;
import java.util.Scanner;

class Fahrkartenautomat {
	public static void main(String[] args) {

		Scanner tastatur = new Scanner(System.in);

		double zuZahlenderBetrag = 0;
		double eingeworfeneMuenze;
		double rueckgabebetrag;
		double nochZuZahlen;
    int menge = 0, choice = 0;

		// Geldbetrag eingeben
		System.out.print("Wählen Sie ihre Wunschfahrkarte für Berlin AB aus: ");
    System.out.println("""
                        \n
                        Kurzstrecke AB [2,00 EUR] (1)\r
                        Einzelfahrschein AB [3,00 EUR] (2)\r
                        Tageskarte AB [8,80 EUR] (3)\r
                        4-Fahrten-Karte AB [9,40 EUR] (4)
                       """
                );

    while((choice < 5 || choice > 0) && zuZahlenderBetrag == 0) {
      System.out.print("Ihre Wahl: ");
      choice = tastatur.nextInt();
      switch(choice) {
        case 1:
          zuZahlenderBetrag = 2.0;
          break;
        case 2:
          zuZahlenderBetrag = 3.0;
          break;
        case 3:
          zuZahlenderBetrag = 8.8;
          break;
        case 4:
          zuZahlenderBetrag = 9.4;
          break;
        default:
          System.out.println(" >> Falsche Eingabe << ");
          System.out.print("Ihre Wahl: ");
          choice = tastatur.nextInt();
          break;
      }
    }

    while(menge < 1 || menge > 10 ) {
      System.out.println(" >> Waehlen Sie bitte eine Anzahl von Tickets von 1 bis 10 aus! << ");
      // Menge eingeben
      System.out.print("Menge der Tickets: ");
      try {
        menge = tastatur.nextInt();
      } catch (InputMismatchException e) {
        tastatur.reset();
        System.out.println(" >> Bitte geben Sie nur Zahlen ein! << ");
        menge = tastatur.nextInt();
      }
    }

		// Geldeinwurf
		nochZuZahlen = menge * zuZahlenderBetrag;
    do { 
      System.out.printf("Noch zu zahlen: %.2f Euro\n", nochZuZahlen);
			System.out.print("Eingabe (mind. 5 Cent, höchstens 2 Euro): ");
			eingeworfeneMuenze = tastatur.nextDouble();
			nochZuZahlen = nochZuZahlen - eingeworfeneMuenze;
    } while (nochZuZahlen > 0);
		
		// Fahrscheinausgabe
		System.out.println("\nFahrschein wird ausgegeben");
		for (int i = 0; i < 8; i++) {
			System.out.print("=");
			try {
				Thread.sleep(200);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("\n\n");
		
		// Rückgeldberechnung und -ausgabe
		rueckgabebetrag = Math.round(nochZuZahlen);
		if (rueckgabebetrag < 0.0) {
			System.out.printf("Der Rückgabebetrag in Höhe von %.2f", -rueckgabebetrag);
			System.out.println(" Euro wird in folgenden Münzen ausgezahlt:");

			while (rueckgabebetrag <= -2.0) { // 2-Euro-Münzen
				System.out.println("2 Euro");
				rueckgabebetrag = rueckgabebetrag + 2.0;
			}
			while (rueckgabebetrag <= -1.0) { // 1-Euro-Münzen
				System.out.println("1 Euro");
				rueckgabebetrag = rueckgabebetrag + 1.0;
			}
			while (rueckgabebetrag <= -0.5) { // 50-Cent-Münzen
				System.out.println("50 Cent");
				rueckgabebetrag = rueckgabebetrag + 0.5;
			}
			while (rueckgabebetrag <= -0.2) { // 20-Cent-Münzen
				System.out.println("20 Cent");
				rueckgabebetrag = rueckgabebetrag + 0.2;
			}
			while (rueckgabebetrag <= -0.1) { // 10-Cent-Münzen
				System.out.println("10 Cent");
				rueckgabebetrag = rueckgabebetrag + 0.1;
			}
			while (rueckgabebetrag <= -0.05) { // 5-Cent-Münzen
				System.out.println("5 Cent");
				rueckgabebetrag = rueckgabebetrag + 0.05;
			}
		}

		System.out.println("""
        \nVergessen Sie nicht, den Fahrschein 
        vor Fahrtantritt entwerten zu lassen!\n\n
        Wir wünschen Ihnen eine gute Fahrt.
        """);

		tastatur.close();
	}
}