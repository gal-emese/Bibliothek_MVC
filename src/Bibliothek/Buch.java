package Bibliothek;

import com.sun.source.doctree.VersionTree;

// Model
public class Buch {
    private int BuchID;
    private String BuchTitel;
    private String BuchDeckelFarbe;
    private String Verfasser;
    private int Seitenzahl;
    private boolean Verfugbar;  // true -> verfugbar, false -> nicht verfugbar

    // Instanz erstellen
    Buch(int id, String titel, String farbe, String verfasser, int anzahl, boolean verfugbar){
        BuchID = id;
        BuchTitel = titel;
        Verfasser = farbe;
        BuchDeckelFarbe=verfasser;
        Seitenzahl = anzahl;
        Verfugbar = verfugbar;
    }

    // getter
    public int getBuchID(){
        return BuchID;
    }

    public String getBuchTitel() {
        return BuchTitel;
    }

    public String getBuchDeckelFarbe(){
        return BuchDeckelFarbe;
    }

    public String getVerfasser(){
        return Verfasser;
    }

    public int getSeitenzahl(){
        return Seitenzahl;
    }

    public boolean getVerfugbar(){
        return Verfugbar;
    }

    // setter
    public void setBuchID(int id){
        this.BuchID = id;
    }

    public void setBuchTitel(String titel){
        this.BuchTitel = titel;
    }

    public void setBuchDeckelFarbe(String farbe){
        this.BuchDeckelFarbe = farbe;
    }

    public void setVerfasser(String verfasser){
        this.Verfasser = verfasser;
    }

    public void setSeitenzahl(int anzahl){
        this.Seitenzahl = anzahl;
    }

    public void setVerfugbar(boolean verfugbar) {
        this.Verfugbar = verfugbar;
    }
}
