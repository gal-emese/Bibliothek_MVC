package Bibliothek;

public class MVCPattern {
    public static void main(String[] args) {
        Buch model = getBuchAusDatenbank();
        BuchView view = new BuchView();
        BuchController controller = new BuchController(model, view);
        controller.updateView();

        controller.setBuchDeckelFarbe("rot");
        System.out.println("Nach update: ");
        controller.updateView();
    }

    private static Buch getBuchAusDatenbank() {
        Buch buch = new Buch(123,"Die Leiden des jungen Werther","Johann Wolfgang von Goethe","blau",206,true);
        return buch;
    }
}
