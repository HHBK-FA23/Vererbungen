package de.hhbk.tutorial.schnittstelle;

public class Start {

    public static void main(String... args){
        Monitor monitor = new Monitor();
        Quader quader = new Quader(25.5, 24.3, 19.5);
        Figur rechteck = new Rechteck(14.2, 42);
        Zeichenbar zeichung = new Baum(43);


        //ACHTUNG UNSAFE Cast, man muss wissen welchen Typen man wirklich hat
        //Baum Methode aus dem Zeichenbar Interface aufrufen (Cast)
        Baum castedBaum = (Baum) zeichung;
        castedBaum.photosynthese();

        //Baum Methode sicher casten wenn man nicht weis, welchen Typen man wirklich hat (In diesem Fall nicht nötig)
        System.out.println("Zeichnung Variable ist vom Typen Baum: " + (zeichung instanceof Baum));
        if(zeichung instanceof Baum){
            Baum safeCastedBaum = (Baum) zeichung;
            safeCastedBaum.photosynthese();
        }

        monitor.darstellen(quader);
        monitor.darstellen(rechteck);
        monitor.darstellen(zeichung);
    }
}
