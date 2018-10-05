package model.dreiecke;

import model.Dreieck;
import model.Figur;
;

public class DreieckBeliebig extends Dreieck implements Figur{

    public DreieckBeliebig(int seiteA, int seiteB, int seiteC) {
        super(seiteA, seiteB, seiteC);
    }

    @Override
    public double berechneUmfang() {
        return getSeiteA() + getSeiteB() + getSeiteC();
    }

    @Override
    public double berechneFlaeche() {
        double s = (getSeiteA() + getSeiteB() + getSeiteC()) >> 1;
        return Math.sqrt(s * (s - getSeiteA()) * (s - getSeiteB()) * (s - getSeiteC()));
    }

    @Override
    public String toString() {
        return "DreieckBeliebig{} " +
                "Umfang= " + berechneUmfang() +
                ", Fläche= " + berechneFlaeche()
                + super.toString();
    }
}