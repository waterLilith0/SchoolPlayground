
import java.util.Scanner;

class A341_Rechteck {
  public static void main(String[] args) {
    // variables
    int seiteA, seiteB, umfang, flaeche;
    Scanner input = new Scanner(System.in);
    // Eingabe (E)
    System.out.print("\nSeiteA (in cm): ");
    seiteA = input.nextInt();
    System.out.print("\nSeiteB (in cm): ");
    seiteB = input.nextInt();
    // Verarbeitung (V)
    umfang = seiteA * 2 + seiteB * 2;
    flaeche = seiteA * seiteB; 
    // Ausgabe (A)
    System.out.println("Umfang = " + umfang + " cm");
    System.out.println("Flaeche = " + flaeche + " cm^2");

  }
}