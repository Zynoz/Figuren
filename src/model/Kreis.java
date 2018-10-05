package model;

public class Kreis implements Figur {

    private double radius;

    public Kreis(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double berechneUmfang() {
        return Math.PI * 2 *radius;
    }

    @Override
    public double berechneFlaeche() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Kreis{" +
                "radius=" + radius +
                ", Umfang= " + berechneUmfang() +
                ", Fläche= " + berechneFlaeche() +
                '}';
    }
}