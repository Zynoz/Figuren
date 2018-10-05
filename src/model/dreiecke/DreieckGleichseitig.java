package model.dreiecke;

import model.Dreieck;
import model.Figur;

public class DreieckGleichseitig extends Dreieck implements Figur {

    private DreieckGleichseitig(int seite) {
        super(seite, seite, seite);
    }

    public int getSeite() {
        return super.getSeiteA();
    }

    public void setSeite(int seite) {
        setSeiteA(seite);
        setSeiteB(seite);
        setSeiteC(seite);
    }

    @Override
    public double berechneUmfang() {
        return getSeiteA() * 3;
    }

    @Override
    public double berechneFlaeche() {
        return (getSeiteA() * getSeite() * Math.sqrt(3)) / 4;
    }

    @Override
    public String toString() {
        return "DreieckGleichseitig{" +
                "Umfang= " + berechneUmfang() +
                ", Fläche= " + berechneFlaeche() +
                "} " + super.toString();
    }
}