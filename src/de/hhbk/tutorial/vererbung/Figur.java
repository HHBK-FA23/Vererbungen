package de.hhbk.tutorial.vererbung;

public class Figur {

    private double laenge;
    private double breite;

    public Figur(double laenge, double breite){
        this.laenge = laenge;
        this.breite = breite;
    }

    public double berechneFlaeche(){
        return this.laenge * this.breite;
    }
}
