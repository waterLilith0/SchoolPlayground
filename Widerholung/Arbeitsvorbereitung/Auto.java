class Auto {
    private String hersteller;
    private String bezeichnung;
    private int leistung;

    public Auto() {}

    public Auto(String hersteller, String bezeichnung, int leistung) {
        this.hersteller = hersteller;
        this.bezeichnung = bezeichnung;
        this.leistung = leistung;
    }

    public String getHersteller() {
        return hersteller;
    }
    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }
    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public int getLeistung() {
        return leistung;
    }
    public void setLeistung(int leistung) {
        this.leistung = leistung;
    }

    void beschleunigen(int menge) {
        System.out.println("Das Auto beschleunigt um " + menge + " km/h.");
    }

    void bremsen() {
        System.out.println("Das Auto bremst ab.");
    }

    void lenken(String richtung) {
        System.out.println("Das Auto lenkt nach " + richtung + ".");
    }

    @Override
    public String toString() {
        return "Auto [hersteller=" + hersteller + ", bezeichnung=" + bezeichnung + ", leistung=" + leistung + "]";
      }
    }