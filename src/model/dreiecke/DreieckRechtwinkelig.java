package model.dreiecke;

import model.Dreieck;
import model.Figur;

public class DreieckRechtwinkelig extends Dreieck implements Figur {

    public DreieckRechtwinkelig(int seiteA, int seiteB, int seiteC) {
        super(seiteA, seiteB, seiteC);
    }

    @Override
    public double berechneUmfang() {
        return getSeiteA() + getSeiteB() + getSeiteC();
    }

    @Override
    public double berechneFlaeche() {
        return (getSeiteA() * getSeiteA() * Math.sqrt(3)) / 4;
    }

    @Override
    public String toString() {
        return "DreieckRechtwinkelig{} " +
                "Umfang= " + berechneUmfang() +
                ", Fläche= " + berechneFlaeche()
                + super.toString();
    }
}