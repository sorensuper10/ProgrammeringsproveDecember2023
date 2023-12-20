import java.util.ArrayList;

public class Karakterer {

    //karakterListe skal indeholde alle elevers karakterer
    private ArrayList<Integer> karakterListe;

    Karakterer() {
    }

    Karakterer(ArrayList<Integer> karakterListe) {
        karakterListe = new ArrayList<Integer>();
    }

    public ArrayList<Integer> getKarakterListe() {
        return karakterListe;
    }

    public void setKarakterListe(ArrayList<Integer> karakterListe) {
    }


    //Metoden skal tilføje karakteren kar til karakterListe
    public void tilfoejkarakter(int kar) {
        karakterListe.add(kar);
    }
}


