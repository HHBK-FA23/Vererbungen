package de.hhbk.tutorial.schnittstelle;

public abstract class Figur implements Zeichenbar{

    private double laenge;
    private double breite;

    public Figur(double laenge, double breite){
        this.laenge = laenge;
        this.breite = breite;
    }

    public double berechneFlaeche(){
        return this.laenge * this.breite;
    }

    public abstract double berechneVolumen();
}
