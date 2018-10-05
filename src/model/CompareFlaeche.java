package model;

import java.util.Comparator;

public class CompareFlaeche implements Comparator<Figur> {
    @Override
    public int compare(Figur o1, Figur o2) {
        return (int) (o1.berechneFlaeche() - o2.berechneFlaeche());
    }
}