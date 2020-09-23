package de.hhbk.tutorial.base;

public class Rechteck {

    private double laenge;
    private double breite;

    public Rechteck(double laenge, double breite){
        this.laenge = laenge;
        this.breite = breite;
    }

    public double berechneFlaeche(){
        return this.laenge * this.breite;
    }

    public double berechneVolumen(){
        return 0.0;
    }

    public void zeichnen() {
        System.out.println("Rechteck wird gezeichnet in einem 2d Modell");
    }
}
