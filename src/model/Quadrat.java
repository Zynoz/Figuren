package model;

public class Quadrat extends Rechteck {

    private double seite;

    public Quadrat(int seite) {
        super(seite, seite);
        setSeite(seite);
    }

    public double getSeite() {
        return seite;
    }

    public void setSeite(double seite) {
        this.seite = seite;
    }

    public double berechneUmfang() {
        return 4 * seite;
    }

    public double berechneFlaeche() {
        return seite * seite;
    }

    @Override
    public String toString() {
        return "Quadrat{" +
                "seite=" + seite +
                ", Umfang= " + berechneUmfang() +
                ", Fläche= " + berechneFlaeche() +
                "} " + super.toString();
    }
}