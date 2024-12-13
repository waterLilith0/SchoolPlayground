/**
 * Fahrkartenautomat Übungsprojekt
 * @author Miriam Fix (FI-B 46)
 * @version A2.6 Fahrkartenautomat kommentieren
 * A4.3: Ticketgrenzen im Fahrkartenautomat 
 */

import java.util.Scanner;

class Fahrkartenautomat {
	public static void main(String[] args) {

		Scanner tastatur = new Scanner(System.in);

		double zuZahlenderBetrag;
		double eingezahlterGesamtbetrag;
		double eingeworfeneMuenze;
		double rueckgabebetrag;
		double nochZuZahlen;
    int menge;

		// Geldbetrag eingeben
		System.out.print("Ticketpreis (Euro): ");
		zuZahlenderBetrag = tastatur.nextDouble();

    // Menge eingeben
    System.out.println("Menge der Tickets: ");
    menge = tastatur.nextInt();
    if (menge > 10  || menge <= 0) {
      System.out.println("Fehler! Anzahl Tickets nicht zwischen 1 und 10. Anzahl auszugebender Tickets wurde automatisch auf \"1\" gesetzt");
      menge = 1;
    }

		// Geldeinwurf
		eingezahlterGesamtbetrag = 0.0;
		nochZuZahlen = menge * zuZahlenderBetrag;
    do { 
      System.out.printf("Noch zu zahlen: %.2f Euro\n", nochZuZahlen);
			System.out.print("Eingabe (mind. 5 Cent, höchstens 2 Euro): ");
			eingeworfeneMuenze = tastatur.nextDouble();
			nochZuZahlen = nochZuZahlen - eingeworfeneMuenze;
    } while (nochZuZahlen > 0);
		
    System.out.println(nochZuZahlen);
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
		rueckgabebetrag = nochZuZahlen;
		if (rueckgabebetrag < 0.0) {
			System.out.println("Der Rückgabebetrag in Höhe von " + rueckgabebetrag + " Euro");
			System.out.println("wird in folgenden Münzen ausgezahlt:");

			while (rueckgabebetrag <= 2.0) { // 2-Euro-Münzen
				System.out.println("2 Euro");
				rueckgabebetrag = rueckgabebetrag + 2.0;
			}
			while (rueckgabebetrag <= 1.0) { // 1-Euro-Münzen
				System.out.println("1 Euro");
				rueckgabebetrag = rueckgabebetrag + 1.0;
			}
			while (rueckgabebetrag <= 0.5) { // 50-Cent-Münzen
				System.out.println("50 Cent");
				rueckgabebetrag = rueckgabebetrag + 0.5;
			}
			while (rueckgabebetrag <= 0.2) { // 20-Cent-Münzen
				System.out.println("20 Cent");
				rueckgabebetrag = rueckgabebetrag + 0.2;
			}
			while (rueckgabebetrag <= 0.1) { // 10-Cent-Münzen
				System.out.println("10 Cent");
				rueckgabebetrag = rueckgabebetrag + 0.1;
			}
			while (rueckgabebetrag <= 0.05) { // 5-Cent-Münzen
				System.out.println("5 Cent");
				rueckgabebetrag = rueckgabebetrag + 0.05;
			}
		}

		System.out.println("\nVergessen Sie nicht, den Fahrschein\n" + "vor Fahrtantritt entwerten zu lassen!\n"
				+ "Wir wünschen Ihnen eine gute Fahrt.");

		tastatur.close();
	}
}