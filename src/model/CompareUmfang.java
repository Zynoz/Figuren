package model;

import java.util.Comparator;

public class CompareUmfang implements Comparator<Figur> {
    @Override
    public int compare(Figur o1, Figur o2) {
        return (int) (o1.berechneUmfang() - o2.berechneUmfang());
    }
}
