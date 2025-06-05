public class AutoTest {
  public static void main(String[] args) {
    // Erstellen von Auto-Objekten
    Auto auto1 = new Auto("Volkswagen", "Golf", 150);
    Auto auto2 = new Auto("BMW", "3er", 180);
    
    // Ausgabe der Auto-Informationen
    System.out.println(auto1);
    System.out.println(auto2);
    
    // Autos beschleunigen, bremsen und lenken
    auto1.beschleunigen(60);
    auto2.bremsen();
    auto1.lenken("rechts");
  } 
}
