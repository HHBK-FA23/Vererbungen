package de.hhbk.tutorial.vererbung;

public class Rechteck extends Figur {

    public Rechteck(double laenge, double breite){
        super(laenge, breite);
    }

    public double berechneVolumen(){
        return 0.0;
    }

    public void zeichnen() {
        System.out.println("Rechteck wird gezeichnet in einem 2d Modell");
    }
}
