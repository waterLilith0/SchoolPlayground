public class Halter {
  private String name;
  private int alter;
  private Auto[] autoListe;

  public Halter() {}
  public Halter(String name, int alter) {
    this.name = name;
    this.alter = alter;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getAlter() {
    return alter;
  }
  public void setAlter(int alter) {
    this.alter = alter;
  }
  public Auto[] getAutoListe() {
    return autoListe;
  }
  public void setAutoListe(Auto[] autoListe) {
    this.autoListe = autoListe;
  }
  public void fahren(boolean fahre) {
    if (fahre) {
      System.out.println(name + " fährt mit dem Auto.");
    } else {
      System.out.println(name + " bleibt stehen.");
    }
  }

    @Override
    public String toString() {
        return "Halter{" +
                "name='" + name + '\'' +
                ", alter=" + alter +
                ", autoListe=" + (autoListe != null ? java.util.Arrays.toString(autoListe) : "null") +
                '}';
    }
}
