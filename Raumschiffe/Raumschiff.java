
import java.util.ArrayList;

public class Raumschiff {
  private int photonenTorpedoAnzahl;
  private int energieversogungInProzent;
  private int schildeInProzent;
  private int huelleInProzent;
  private int lebenserhaltungsSystemeInProzent;
  private int androidenAnzahl;
  private String schiffsName;
  private ArrayList<Ladung> ladungen;

  public Raumschiff() {}

  public Raumschiff(String schiffsName, int photonenTorpedoAnzahl, int energieversogungInProzent, int schildeInProzent, int huelleInProzent, int lebenserhaltungsSystemeInProzent, int androidenAnzahl, ArrayList<Ladung> ladungen) {
        this.schiffsName = schiffsName;
        this.photonenTorpedoAnzahl = photonenTorpedoAnzahl;
        this.energieversogungInProzent = energieversogungInProzent;
        this.schildeInProzent = schildeInProzent;
        this.huelleInProzent = huelleInProzent;
        this.lebenserhaltungsSystemeInProzent = lebenserhaltungsSystemeInProzent;
        this.androidenAnzahl = androidenAnzahl;
        this.ladungen = new ArrayList<>();
    }

    public int getPhotonenTorpedoAnzahl() {
        return photonenTorpedoAnzahl;
    }

    public void setPhotonenTorpedoAnzahl(int photonenTorpedoAnzahl) {
        this.photonenTorpedoAnzahl = photonenTorpedoAnzahl;
    }

    public int getEnergieversogungInProzent() {
        return energieversogungInProzent;
    }

    public void setEnergieversogungInProzent(int energieversogungInProzent) {
        this.energieversogungInProzent = energieversogungInProzent;
    }

    public int getSchildeInProzent() {
        return schildeInProzent;
    }

    public void setSchildeInProzent(int schildeInProzent) {
        this.schildeInProzent = schildeInProzent;
    }

    public int getHuelleInProzent() {
        return huelleInProzent;
    }

    public void setHuelleInProzent(int huelleInProzent) {
        this.huelleInProzent = huelleInProzent;
    }

    public int getLebenserhaltungsSystemeInProzent() {
        return lebenserhaltungsSystemeInProzent;
    }

    public void setLebenserhaltungsSystemeInProzent(int lebenserhaltungsSystemeInProzent) {
        this.lebenserhaltungsSystemeInProzent = lebenserhaltungsSystemeInProzent;
    }

    public int getAndroidenAnzahl() {
        return androidenAnzahl;
    }

    public void setAndroidenAnzahl(int androidenAnzahl) {
        this.androidenAnzahl = androidenAnzahl;
    }

    public String getSchiffsName() {
        return schiffsName;
    }

    public void setSchiffsName(String schiffsName) {
        this.schiffsName = schiffsName;
    }

    public ArrayList<Ladung> getLadungen() {
        return ladungen;
    }

    public void setLadungen(ArrayList ladungen) {
        this.ladungen = ladungen;
    }

    public void addLadung(Ladung neueLadung) {
        this.ladungen.add(neueLadung);
    }

    public void photonenTorpedoShiessen(Raumschiff r) {
        if (photonenTorpedoAnzahl > 0) {
            photonenTorpedoAnzahl--;
            System.out.println("Photonentorpedo abgeschossen");
        } else {
            System.out.println("-=*Click*=-");
        }
    }
  
    public void phaserKanonenSchiessen(Raumschiff r) {}

    private void treffer(Raumschiff r) {}

    public void nachrichtAnAlle(String message) {}

    public void zustandRaumschiff() {
      System.out.println("Schiffsname: " + schiffsName +
              ", Photonentorpedos: " + photonenTorpedoAnzahl +
              ", Energieversorgung: " + energieversogungInProzent + "%" +
              ", Schilde: " + schildeInProzent + "%" +
              ", Hülle: " + huelleInProzent + "%" +
              ", Lebenserhaltungssysteme: " + lebenserhaltungsSystemeInProzent +
              ", Androidenanzahl: " + androidenAnzahl);
    }

  }
