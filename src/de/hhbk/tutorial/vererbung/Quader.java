package de.hhbk.tutorial.vererbung;

public class Quader extends Figur {

    private double hoehe;

    public Quader(double laenge, double breite, double hoehe){
        super(laenge, breite);
        this.hoehe = hoehe;
    }

    public double berechneVolumen(){
        return berechneFlaeche() * this.hoehe;
    }

    public void zeichnen() {
        System.out.println("Quader wird gezeichnet in einem 3d Modell");
    }
}
