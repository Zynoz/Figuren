package model;

public class Ellipse implements Figur {

    private double laenge, breite;

    public Ellipse(int laenge, int breite) {
        setBreite(breite);
        setLaenge(laenge);
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
        double a = laenge / 2;
        double b = breite / 2;
        return Math.PI * a * b;
    }

    @Override
    public double berechneFlaeche() {
        double a, b;
        a = laenge;
        b = breite;
        double lamda = (a - b) / (a + b);
        return (a + b) * Math.PI * (1 + (3 * lamda * lamda /(10 + Math.sqrt(4 - 3 * lamda * lamda))));
    }

    @Override
    public String toString() {
        return "Ellipse{" +
                "laenge=" + laenge +
                ", breite=" + breite +
                ", Umfang= " + berechneUmfang() +
                ", Fläche= " + berechneFlaeche() +
                '}';
    }
}