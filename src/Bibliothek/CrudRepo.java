package Bibliothek;

public class CrudRepo {
    private Buch[] Bucher = new Buch[100];
    private int Anzahl=0;

    public boolean suchtBuch(int id)
    {
        int index = 0;
        while (index < Anzahl && Bucher[index].getBuchID()!=id)
        {
            index++;
        }
        if (index < Anzahl) // Buch gefunden
            return true;
        else
            return false;
    }

    public void speichertBuch(Buch buch)
    {
        Bucher[Anzahl] = buch;
        Anzahl++;
    }

    public void loschtBuch(int id)
    {
        int index = 0;
        while (index < Anzahl && Bucher[index].getBuchID()!=id)
        {
            index++;
        }
        if (index < Anzahl)
        {
            Bucher[index] = Bucher[Anzahl-1];
            Anzahl--;
        }
    }

}
