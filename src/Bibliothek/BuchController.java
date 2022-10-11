package Bibliothek;

public class BuchController {
    private Buch model;
    private BuchView view;

    public BuchController(Buch model, BuchView view){
        this.model = model;
        this.view = view;
    }

    // getter
    public int getBuchID(){
        return model.getBuchID();
    }

    public String getBuchTitel() {
        return model.getBuchTitel();
    }

    public String getBuchDeckelFarbe(){
        return model.getBuchDeckelFarbe();
    }

    public String getVerfasser(){
        return model.getVerfasser();
    }

    public int getSeitenzahl(){
        return model.getSeitenzahl();
    }

    public boolean getVerfugbar(){
        return model.getVerfugbar();
    }

    // setter
    public void setBuchID(int id){
        model.setBuchID(id);
    }

    public void setBuchTitel(String titel){
        model.setBuchTitel(titel);
    }

    public void setBuchDeckelFarbe(String farbe){
        model.setBuchDeckelFarbe(farbe);
    }

    public void setVerfasser(String verfasser){
        model.setVerfasser(verfasser);
    }

    public void setSeitenzahl(int anzahl){
        model.setSeitenzahl(anzahl);
    }

    public void setVerfugbar(boolean verfugbar) {
       model.setVerfugbar(verfugbar);
    }

    public void updateView(){
        view.zeigBuchDaten(model.getBuchID(), model.getBuchTitel(), model.getBuchDeckelFarbe(), model.getVerfasser(), model.getSeitenzahl(), model.getVerfugbar());
    }
}
