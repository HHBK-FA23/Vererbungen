package de.hhbk.tutorial.base;

public class Baum {

    private int anzahlBlaetter;

    public Baum(int anzahlBlaetter){
        this.anzahlBlaetter = anzahlBlaetter;
    }

    public void photosynthese(){
        System.out.println("Erzeuge energiereiche Biomoleküle aus energieärmeren Stoffen mithilfe von Lichtenergie");
    }

    public void zeichnen() {
        System.out.println("Baum wird mit all seinen Blättern gezeichnet in einem 2d Modell");
    }
}
