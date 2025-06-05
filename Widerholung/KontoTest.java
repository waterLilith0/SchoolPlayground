class KontoTest {
  public static void main(String[] args) {
    Konto konto1 = new Konto();
    Konto konto2 = new Konto();
    konto1.setIban(123456789);
    konto1.setKontoStand(1000.0);
    konto2.setIban(987654321);
    konto2.setKontoStand(500.0);
    System.out.println("Kontostand von Konto 1: " + konto1.getKontoStand());
    System.out.println("Kontostand von Konto 2: " + konto2.getKontoStand());
    
    konto1.abheben(200.0);
    System.out.println("Kontostand nach Abhebung von Konto 1: " + konto1.getKontoStand());
    System.out.println("Kontostand nach Einzahlung von Konto 2:");
    konto2.einzahlen(300.0);
    System.out.println(konto2.getKontoStand());
    System.out.println("Kontostand nach Ueberweisung von Konto 1 nach Konto 2:");
    konto1.ueberweisen(150.0, konto2);
    System.out.println(konto1.getKontoStand());
    System.out.println(konto2.getKontoStand());

    Besitzer besitzer = new Besitzer();
    besitzer.setName("Mustermann");
    besitzer.setVorname("Max");
    besitzer.setKonto1(konto1);
    besitzer.setKonto2(konto2);
    besitzer.gesamtUebersicht();
    besitzer.gesamtVermoegen();
  }
}