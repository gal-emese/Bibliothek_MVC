package Bibliothek;

public class BuchView {
    public void zeigBuchDaten(int BuchID, String BuchTitel, String BuchDeckelFarbe, String Verfasser, int Seitenzahl, boolean Verfugbar){
        System.out.println("*Buch Daten*");
        System.out.println("ID: " + BuchID);
        System.out.println("Titel: " + BuchTitel);
        System.out.println("Buchdeckel Farbe: " + BuchDeckelFarbe);
        System.out.println("Vefasser: " + Verfasser);
        System.out.println("Seitenzahl: " + Seitenzahl);
        if (Verfugbar)
            System.out.println("Verfugbar");
        else
            System.out.println("Nicht verfugbar");
    }
}
