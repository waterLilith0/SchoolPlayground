public class HalterTest {
  public static void main(String[] args) {
    // Erstellen von Auto-Objekten
    Auto auto1 = new Auto("Volkswagen", "Golf", 150);
    Auto auto2 = new Auto("BMW", "3er", 180);
    
    // Ausgabe der Auto-Informationen
    System.out.println(auto1);
    System.out.println(auto2);
    
    // Erstellen von Halter-Objekten
    Halter halter1 = new Halter("Max Mustermann", 30);
    Halter halter2 = new Halter("Erika Musterfrau", 28);
    
    // Zuweisen der Autos zu den Haltern
    halter1.setAutoListe(new Auto[]{auto1});
    halter2.setAutoListe(new Auto[]{auto2});
    
    // Ausgabe der Halter-Informationen
    System.out.println(halter1);
    System.out.println(halter2);
    
    // Halter fahren lassen
    halter1.fahren(true);
    halter2.fahren(false);
    
    // Autos beschleunigen, bremsen und lenken
    auto1.beschleunigen(60);
    auto2.bremsen();
    auto1.lenken("rechts");
  }
}
