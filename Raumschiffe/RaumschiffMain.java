
import java.util.ArrayList;

public class RaumschiffMain {
  public static void main(String[] args) {
    Raumschiff klingonen = new Raumschiff("IKS Hegh'ta'", 1, 100, 100, 100, 100, 2, new ArrayList<>());
    Raumschiff romulaner = new Raumschiff("IRW Khazara", 2, 100, 100, 100, 100, 2, new ArrayList<>());
    Raumschiff vulkanier = new Raumschiff("Ni'Var", 0, 80, 80, 100, 50, 5, new ArrayList<>());
    
    Ladung l1 = new Ladung("Ferengi Schneckensaft", 200);
    Ladung l2 = new Ladung("Borg-Schrott", 5);
    Ladung l3 = new Ladung("Rote Materie", 2);
    Ladung l4 = new Ladung("Forschungssonde", 35);
    Ladung l5 = new Ladung("Bat'leth Klingonen Schwert'", 200);
    Ladung l6 = new Ladung("Plasma-Waffe", 50);
    Ladung l7 = new Ladung("Photonentorpedo", 3);

    ArrayList<Ladung> ladungen = klingonen.getLadungen();
    ladungen.add(l1);
    ladungen.add(l5);
    klingonen.setLadungen(ladungen);
    ladungen.clear();
    ladungen.add(l2);
    ladungen.add(l3);
    ladungen.add(l6);
    romulaner.setLadungen(ladungen);
    ladungen.clear();
    ladungen.add(l4);
    ladungen.add(l7);
    vulkanier.setLadungen(ladungen);

  }
}
