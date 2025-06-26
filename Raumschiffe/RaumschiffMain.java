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

    // Ladungen verteilen
    klingonen.addLadung(l1);
    klingonen.addLadung(l5);
    romulaner.addLadung(l2);
    romulaner.addLadung(l3);
    romulaner.addLadung(l6);
    vulkanier.addLadung(l7);
    vulkanier.addLadung(l4);

    // 1. Die Klingonen schießen mit dem Photonentorpedo einmal auf die Romulaner.
    System.out.println("--- Aktion 1 ---");
    klingonen.photonenTorpedoShiessen(romulaner);

    // 2. Die Romulaner schießen mit der Phaserkanone zurück.
    System.out.println("\n--- Aktion 2 ---");
    romulaner.phaserKanonenSchiessen(klingonen);

    // 3. Die Vulkanier senden eine Nachricht an Alle “Gewalt ist nicht logisch”.
    System.out.println("\n--- Aktion 3 ---");
    vulkanier.nachrichtAnAlle("Gewalt ist nicht logisch");

    // 4. Die Klingonen rufen den Zustand Ihres Raumschiffes ab und geben Ihr Ladungsverzeichnis aus.
    System.out.println("\n--- Aktion 4 ---");
    System.out.println("--- Zustand Klingonen ---");
    klingonen.zustandRaumschiff();
    System.out.println("--- Ladungsverzeichnis Klingonen ---");
    klingonen.ladungAusgeben();

    // 5. Die Vulkanier sind sehr sicherheitsbewusst und setzen alle Androiden zur Aufwertung ihres Schiffes ein.
    // Assuming "Aufwertung" means repair all systems with available androids.
    System.out.println("\n--- Aktion 5 ---");
    vulkanier.reparaturDurchfuehren(true, true, true, vulkanier.getAndroidenAnzahl());

    // 6. Die Vulkanier verladen Ihre Ladung “Photonentorpedos” in die Torpedoröhren Ihres Raumschiffes und räumen das Ladungsverzeichnis auf.
    System.out.println("\n--- Aktion 6 ---");
    vulkanier.photonentorpedosLaden(3); // Assuming they load all 3 photon torpedoes from cargo
    vulkanier.ladungAufraeumen();

    // 7. Die Klingonen schießen mit zwei weiteren Photonentorpedo auf die Romulaner (merken nicht, dass Sie nicht ausreichend Photonentorpedos für zwei Schüsse haben!).
    System.out.println("\n--- Aktion 7 ---");
    klingonen.photonenTorpedoShiessen(romulaner);
    klingonen.photonenTorpedoShiessen(romulaner);

    // 8. Die Romulaner schießen mit dem Photonentorpedo einmal auf die Vulkanier.
    System.out.println("\n--- Aktion 8 ---");
    romulaner.photonenTorpedoShiessen(vulkanier);

    // 9. Die Vulkanier senden eine Nachricht an Alle “Wir werden angegriffen! "
    System.out.println("\n--- Aktion 9 ---");
    vulkanier.nachrichtAnAlle("Wir werden angegriffen! ");

    // 10. Die Vulkanier senden eine weitere Nachricht an Alle “Wir wollen Frieden!
    System.out.println("\n--- Aktion 10 ---");
    vulkanier.nachrichtAnAlle("Wir wollen Frieden! ");

    // 11. Die Romulaner fliegen weiter zu seinem Heimatplanet Romulus. Dort entladen Sie 35 Plasma-Waffen und 4 mal Rote Materie.
    System.out.println("\n--- Aktion 11 ---");
    System.out.println("--- Romulaner entladen ---");
    romulaner.entladen("Plasma-Waffe", 35);
    romulaner.entladen("Rote Materie", 4);

    // 12. Die Vulkanier entladen Ihre 35 Forschungssonden in Ihren Planet Vulkan.
    System.out.println("\n--- Aktion 12 ---");
    System.out.println("--- Vulkanier entladen ---");
    vulkanier.entladen("Forschungssonde", 35);

    // 13. Die Klingonen entladen 100 Ferengi Schneckensaft in Ihren Planet Qo'noS.
    System.out.println("\n--- Aktion 13 ---");
    System.out.println("--- Klingonen entladen ---");
    klingonen.entladen("Ferengi Schneckensaft", 100);

    // 14. Alle drei Raumschiffe räumen jeweils ihr Ladungsverzeichnis auf.
    System.out.println("\n--- Aktion 14 ---");
    System.out.println("--- Ladungsverzeichnis aufräumen ---");
    klingonen.ladungAufraeumen();
    romulaner.ladungAufraeumen();
    vulkanier.ladungAufraeumen();

    // 15. Die Klingonen, die Romulaner und die Vulkanier rufen jeweils den Zustand Ihres Raumschiffes ab und geben Ihr Ladungsverzeichnis aus.
    System.out.println("\n--- Aktion 15 ---");
    System.out.println("--- Endzustand Klingonen ---");
    klingonen.zustandRaumschiff();
    System.out.println("--- End-Ladungsverzeichnis Klingonen ---");
    klingonen.ladungAusgeben();

    System.out.println("\n--- Endzustand Romulaner ---");
    romulaner.zustandRaumschiff();
    System.out.println("--- End-Ladungsverzeichnis Romulaner ---");
    romulaner.ladungAusgeben();

    System.out.println("\n--- Endzustand Vulkanier ---");
    vulkanier.zustandRaumschiff();
    System.out.println("--- End-Ladungsverzeichnis Vulkanier ---");
    vulkanier.ladungAusgeben();

    // 16. Geben Sie den broadcastKommunikator aus.
    System.out.println("\n--- Aktion 16 ---");
    System.out.println("--- Broadcast Kommunikator Logbuch ---");
    for (String message : Raumschiff.eintraegeLogbuchZurueckgeben()) {
      System.out.println(message);
    }
  }
}
