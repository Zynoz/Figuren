package model;

import java.util.LinkedList;

public class FigurenVerwaltung {
    private LinkedList<Figur> figurs;

    public FigurenVerwaltung() {
        figurs = new LinkedList<>();
    }

    public void aufnehmen(Figur figur) throws FigurenException {
        if (figur != null) {
            if (!figurs.contains(figur)) {
                figurs.add(figur);
            } else {
                throw new FigurenException("Figur schon vorhanden");
            }
        } else {
            throw new FigurenException("Figure ist null");
        }
    }

    public double berechneGesamtUmfang() {
        double sum = 0;
        for(Figur figur : figurs) {
            sum += figur.berechneUmfang();
        }
        return sum;
    }

    public double berechneGesamtFlaeche() {
        double sum = 0;
        for(Figur figur : figurs) {
            sum += figur.berechneFlaeche();
        }
        return sum;
    }

    public void remove(Figur figur) {
        if (figur != null) {
            figurs.remove(figur);
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("FigurenVerwaltung:\n");
        for (Figur figur : figurs) {
            stringBuilder.append(figur);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public void sortiereUmfang() {
        CompareUmfang compareUmfang = new CompareUmfang();
        figurs.sort(compareUmfang);
    }

    public void sortiereFlaeche() {
        CompareFlaeche compareFlaeche = new CompareFlaeche();
        figurs.sort(compareFlaeche);
    }
}