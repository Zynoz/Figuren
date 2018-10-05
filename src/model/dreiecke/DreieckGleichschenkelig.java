package model.dreiecke;

import model.Dreieck;
import model.Figur;

public class DreieckGleichschenkelig extends Dreieck implements Figur {

    public DreieckGleichschenkelig(int seiteA, int seiteB, int seiteC) {
        super(seiteA, seiteB, seiteC);
    }

    public double getSeite() {
        return getSeiteA();
    }

    public void setSeite(int seite) {
        setSeiteA(seite);
        setSeiteB(seite);
    }

    public double getBasis() {
        return getSeiteC();
    }

    public void setBasis(int basis) {
        setSeiteC(basis);
    }

    @Override
    public double berechneUmfang() {
        return getBasis() + getSeite() * 2;
    }

    @Override
    public double berechneFlaeche() {
        return (getBasis() / 2) * Math.sqrt((getSeiteA() * getSeiteA()) - ((getBasis() * getBasis()) / 4));
    }
}