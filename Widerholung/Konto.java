class Konto {
    private int iban;
    private double kontoStand;

    public int setIban(int iban) {
        this.iban = iban;
        return iban;
    }

    public int getIban() {
        return iban;
    }

    public double setKontoStand(double kontoStand) {
        this.kontoStand = kontoStand;
        return kontoStand;
    }

    public double getKontoStand() {
        return kontoStand;
    }

    public void abheben(double betrag) {
        if (betrag <= kontoStand) {
            kontoStand -= betrag;
        } else {
            System.out.println("Nicht genug Geld auf dem Konto.");
        }
    }

    public void einzahlen(double betrag) {
        kontoStand += betrag;
    }

    public void ueberweisen(double betrag, Konto zielKonto) {
        if (betrag <= kontoStand) {
            kontoStand -= betrag;
            zielKonto.einzahlen(betrag);
        } else {
            System.out.println("Nicht genug Geld auf dem Konto.");
        }
    }

}