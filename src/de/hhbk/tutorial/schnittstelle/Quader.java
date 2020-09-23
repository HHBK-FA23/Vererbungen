package de.hhbk.tutorial.schnittstelle;

public class Quader extends Figur {

    private double hoehe;

    public Quader(double laenge, double breite, double hoehe){
        super(laenge, breite);
        this.hoehe = hoehe;
    }

    @Override
    public double berechneVolumen(){
        return berechneFlaeche() * this.hoehe;
    }

    @Override
    public void zeichnen() {
        System.out.println("Quader wird gezeichnet in einem 3d Modell");
    }
}
