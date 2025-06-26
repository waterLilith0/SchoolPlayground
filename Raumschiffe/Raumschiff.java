
import java.security.SecureRandom;
import java.util.ArrayList;

public class Raumschiff {
  private int photonenTorpedoAnzahl;
  private int energieversogungInProzent;
  private int schildeInProzent;
  private int huelleInProzent;
  private int lebenserhaltungsSystemeInProzent;
  private int androidenAnzahl;
  private String schiffsName;
  private static ArrayList<String> broadCastKommunikator;
  private ArrayList<Ladung> ladungsVerzeichnis;

  public Raumschiff() {}

  public Raumschiff(String schiffsName, int photonenTorpedoAnzahl, int energieversogungInProzent, int schildeInProzent, int huelleInProzent, int lebenserhaltungsSystemeInProzent, int androidenAnzahl, ArrayList<Ladung> ladungen) {
        this.schiffsName = schiffsName;
        this.photonenTorpedoAnzahl = photonenTorpedoAnzahl;
        this.energieversogungInProzent = energieversogungInProzent;
        this.schildeInProzent = schildeInProzent;
        this.huelleInProzent = huelleInProzent;
        this.lebenserhaltungsSystemeInProzent = lebenserhaltungsSystemeInProzent;
        this.androidenAnzahl = androidenAnzahl;
        this.ladungsVerzeichnis = new ArrayList<>();
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

    public void entladen(String bezeichnung, int menge) {
      if (ladungsVerzeichnis == null || ladungsVerzeichnis.isEmpty()) {
          System.out.println("Das Raumschiff hat keine Ladungen im Verzeichnis.");
          return;
      }
        for (Ladung ladung : ladungsVerzeichnis) {
            if (ladung.getBezeichnung().equals(bezeichnung)) {
              if (ladung.getMenge() > menge) {
                ladung.setMenge(ladung.getMenge() - menge);
                System.out.println("Die gewünschte Ladung " + ladung.getBezeichnung() + " vom Ladungsverzeichnis konnte entladen werden.");
              } else {
                System.out.println("Nur " + ladung.getMenge() + " Ladung " + ladung.getBezeichnung() + " vom Ladungsverzeichnis konnte entladen werden.");
                ladung.setMenge(0);
              }
            }
            if (ladung.getMenge() == 0) {
              System.out.println("Es sind keine Einheiten mehr von der Ladung im Raumschiff vorhanden.");
            } else {
              System.out.println("Noch "+ ladung.getMenge() + " Einheiten von der Ladung " + ladung.getBezeichnung() + " vorhanden.");
            }
          }
        System.out.println("Die Ladung " + bezeichnung + " ist nicht vorhanden!");
    }

    public void ladungAusgeben() {
      for (Ladung ladung : ladungsVerzeichnis) {
        System.out.println("Bezeichnung: " + ladung.getBezeichnung() + ", Menge: " + ladung.getMenge());
      }
    }

    public void ladungAufraeumen() {
      for (Ladung ladung : ladungsVerzeichnis) {
        if (ladung.getMenge() <= 0) {
          ladungsVerzeichnis.remove(ladung);
        }
      }
    }

    public void addLadung(Ladung neueLadung) {
        this.ladungsVerzeichnis.add(neueLadung);
    }

    public void photonenTorpedoShiessen(Raumschiff r) {
        if (photonenTorpedoAnzahl > 0) {
          photonenTorpedoAnzahl--;
          nachrichtAnAlle("Photonentorpedo abgeschossen");
          treffer(r);
        } else {
          nachrichtAnAlle("-=*Click*=-");
        }
    }
  
    public void phaserKanonenSchiessen(Raumschiff r) {
      if (energieversogungInProzent > 0) {
        energieversogungInProzent--;
        nachrichtAnAlle("Phaserkanonen abgeschossen");
        treffer(r);
      } else {
        nachrichtAnAlle("-=*Click*=-");
      }
    }

    private void treffer(Raumschiff r) {
      nachrichtAnAlle(r.schiffsName + " wurde getroffen!");
      r.schildeInProzent -= 50;
      if (r.schildeInProzent < 0) {
        r.energieversogungInProzent -= 50;
        r.huelleInProzent -= 50;
        if (r.huelleInProzent < 0) {
          r.lebenserhaltungsSystemeInProzent = 0;
          System.out.println("Alle Lebenserhaltssysteme abgeschaltet.");
        }
      }
    }

    public void nachrichtAnAlle(String message) {
      broadCastKommunikator.add(message);
    }

    public static ArrayList<String> eintraegeLogbuchZurueckgeben() {
      return broadCastKommunikator;
    }

    public void photonentorpedosLaden(int anzahlTorpedos) {
      for (Ladung ladung : ladungsVerzeichnis) {
        if (ladung.getBezeichnung().equals("Photonentorpedo")) {
          if (ladung.getMenge() >= anzahlTorpedos) {
            ladung.setMenge(ladung.getMenge() - anzahlTorpedos);
            photonenTorpedoAnzahl += anzahlTorpedos;
            System.out.println(anzahlTorpedos + " Photonentorpedo(s) eingesetzt");
            return;
          } else {
            photonenTorpedoAnzahl += ladung.getMenge();
            ladungsVerzeichnis.remove(ladung);
            return;
          }
        }
      }
      System.out.println("-=*Click*=-");
    }

    public void reparaturDurchfuehren(boolean schutzschilde, boolean energieversorgung, boolean schiffshuelle, int anzahlDroiden) {
      int sumToRepair = 0;
      if (schutzschilde) {
        sumToRepair += schildeInProzent;
      }
      if (energieversorgung) {
        sumToRepair += energieversogungInProzent;
      }
      if (schiffshuelle) {
        sumToRepair += huelleInProzent;
      }

      SecureRandom random = new SecureRandom();
      if (schutzschilde) {
        int reparaturChance = random.nextInt(0, 101);
        if(anzahlDroiden <= androidenAnzahl) {
          int prozentRepariert = (reparaturChance * anzahlDroiden) / sumToRepair;
        } else {
          int prozentRepariert = (reparaturChance * androidenAnzahl) / sumToRepair;
        }
        if (reparaturChance < 50) {
          schildeInProzent += 20;
          System.out.println("Schutzschilde repariert.");
        } else {
          System.out.println("Reparatur der Schutzschilde fehlgeschlagen.");
        }
        if (schutzschilde) {
        schildeInProzent += sumToRepair;
        }
        if (energieversorgung) {
          energieversogungInProzent += sumToRepair;
        }
        if (schiffshuelle) {
          huelleInProzent += sumToRepair;
        }
      }
    }

    public void zustandRaumschiff() {
      System.out.println("Schiffsname: " + schiffsName +
              ", Photonentorpedos: " + photonenTorpedoAnzahl +
              ", Energieversorgung: " + energieversogungInProzent + "%" +
              ", Schilde: " + schildeInProzent + "%" +
              ", Hülle: " + huelleInProzent + "%" +
              ", Lebenserhaltungssysteme: " + lebenserhaltungsSystemeInProzent +
              ", Androidenanzahl: " + androidenAnzahl);
    }

    @Override
    public String toString() {
      return "Raumschiff{" +
              "schiffsName='" + schiffsName + '\'' +
              ", photonenTorpedoAnzahl=" + photonenTorpedoAnzahl +
              ", energieversogungInProzent=" + energieversogungInProzent +
              ", schildeInProzent=" + schildeInProzent +
              ", huelleInProzent=" + huelleInProzent +
              ", lebenserhaltungsSystemeInProzent=" + lebenserhaltungsSystemeInProzent +
              ", androidenAnzahl=" + androidenAnzahl +
              '}';
    }
  }
