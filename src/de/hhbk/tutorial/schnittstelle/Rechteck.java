package de.hhbk.tutorial.schnittstelle;

public class Rechteck extends Figur {

    public Rechteck(double laenge, double breite){
        super(laenge, breite);
    }

    @Override
    public double berechneVolumen(){
        return 0.0;
    }

    @Override
    public void zeichnen() {
        System.out.println("Rechteck wird gezeichnet in einem 2d Modell");
    }
}
