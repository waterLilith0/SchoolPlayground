class Besitzer {
  private String name;
  private String vorName;
  private Konto konto1;
  private Konto konto2;

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public String setVorname(String vorName) {
    this.vorName = vorName;
    return vorName;
  }

  public String getVorname() {
    return vorName;
  }

  public Konto setKonto1(Konto konto1) {
    this.konto1 = konto1;
    return konto1;
  }

  public Konto getKonto1() {
    return konto1;
  }

  public Konto setKonto2(Konto konto2) {
    this.konto2 = konto2;
    return konto2;
  }

  public Konto getKonto2() {
    return konto2;
  }

  public void gesamtUebersicht() {
    System.out.println("Name: " + name);
    System.out.println("Vorname: " + vorName);
    System.out.println("Kontostand Konto 1: " + konto1.getKontoStand());
    System.out.println("Kontostand Konto 2: " + konto2.getKontoStand());
  }

  public void gesamtVermoegen() {
    System.out.println("Gesamtkontostand: " + (konto1.getKontoStand() + konto2.getKontoStand()));
  }
}