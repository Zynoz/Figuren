package model;

public abstract class Dreieck implements Figur {

    private int seiteA, seiteB, seiteC;

    public Dreieck(int seiteA, int seiteB, int seiteC) {
        setSeiteA(seiteA);
        setSeiteB(seiteB);
        setSeiteC(seiteC);
    }

    public int getSeiteA() {
        return seiteA;
    }

    public void setSeiteA(int seiteA) {
        this.seiteA = seiteA;
    }

    public int getSeiteB() {
        return seiteB;
    }

    public void setSeiteB(int seiteB) {
        this.seiteB = seiteB;
    }

    public int getSeiteC() {
        return seiteC;
    }

    public void setSeiteC(int seiteC) {
        this.seiteC = seiteC;
    }

    @Override
    public abstract double berechneUmfang();

    @Override
    public abstract double berechneFlaeche();
}
