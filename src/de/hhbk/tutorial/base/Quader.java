package de.hhbk.tutorial.base;

public class Quader {

    private double laenge;
    private double breite;
    private double hoehe;

    public Quader(double laenge, double breite, double hoehe){
        this.laenge = laenge;
        this.breite = breite;
        this.hoehe = hoehe;
    }

    public double berechneFlaeche(){
        return this.laenge * this.breite;
    }

    public double berechneVolumen(){
        return berechneFlaeche() * this.hoehe;
    }

    public void zeichnen() {
        System.out.println("Quader wird gezeichnet in einem 3d Modell");
    }
}
