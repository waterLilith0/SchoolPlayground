class SchuelerTest {
  public static void main(String[] args) {
    Schueler schueler1 = new Schueler();
    Schueler schueler2 = new Schueler();
    schueler1.setName("Max");
    schueler1.setAlter(12);
    schueler2.setName("Anna");
    schueler2.setAlter(11);
    
    schueler1.lernen("Mathe");
    schueler2.lernen("Englisch");

    System.out.println(schueler1.getName() + " " + schueler1.getAlter());
    System.out.println(schueler2.getName() + " " + schueler2.getAlter());
  }
}