package model;

import java.util.Comparator;

public class Rechteck implements Figur, Comparator<Figur> {

    private double laenge, breite;

    public Rechteck(double laenge, double breite) {
        setLaenge(laenge);
        setBreite(breite);
    }

    public double getLaenge() {
        return laenge;
    }

    public void setLaenge(double laenge) {
        this.laenge = laenge;
    }

    public double getBreite() {
        return breite;
    }

    public void setBreite(double breite) {
        this.breite = breite;
    }

    @Override
    public double berechneUmfang() {
        return breite * 2 + laenge * 2;
    }

    @Override
    public double berechneFlaeche() {
        return breite * laenge;
    }

    @Override
    public String toString() {
        return "Rechteck{" +
                "laenge=" + laenge +
                ", breite=" + breite +
                ", Umfang= " + berechneUmfang() +
                ", Fläche= " + berechneFlaeche() +
                '}';
    }

    @Override
    public int compare(Figur o1, Figur o2) {
        return 0;
    }
}