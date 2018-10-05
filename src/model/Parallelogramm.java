package model;

import java.util.Comparator;

public class Parallelogramm implements Figur, Comparator<Figur> {

    private double laenge;
    private double seite;

    public Parallelogramm(double laenge, double seite) {
        setLaenge(laenge);
        setSeite(seite);
    }

    public double getLaenge() {
        return laenge;
    }

    public void setLaenge(double laenge) {
        this.laenge = laenge;
    }

    public double getSeite() {
        return seite;
    }

    public void setSeite(double seite) {
        this.seite = seite;
    }

    @Override
    public double berechneUmfang() {
        return 2 * laenge + 2 * seite;
    }

    //TODO Formel ergänzen
    @Override
    public double berechneFlaeche() {
        return 0;
    }

    @Override
    public String toString() {
        return "Parallelogramm{" +
                "laenge=" + laenge +
                ", seite=" + seite +
                ", Umfang= " + berechneUmfang() +
                ", Fläche= " + berechneFlaeche() +
                '}';
    }

    @Override
    public int compare(Figur o1, Figur o2) {
        return 0;
    }
}