public class Servicemedarbejder extends Ansat{

    String speciale;

    int timeløn;

    public Servicemedarbejder() {
    }

    public Servicemedarbejder(String speciale, int timeløn) {
        this.speciale = speciale;
        this.timeløn = timeløn;
    }

    public Servicemedarbejder(int medarbejderNr, String fnavn, String enavn, String adresse, String ansættelsesdato, String afdelingsNummer, String speciale, int timeløn) {
        super(medarbejderNr, fnavn, enavn, adresse, ansættelsesdato, afdelingsNummer);
        this.speciale = speciale;
        this.timeløn = timeløn;
    }

    public String getSpeciale() {
        return speciale;
    }

    public void setSpeciale(String speciale) {
        this.speciale = speciale;
    }

    public int getTimeløn() {
        return timeløn;
    }

    public void setTimeløn(int timeløn) {
        this.timeløn = timeløn;
    }

    @Override
    public String toString() {
        return "Servicemedarbejder{" +
                "speciale='" + speciale + '\'' +
                ", timeløn=" + timeløn +
                ", medarbejderNr=" + medarbejderNr +
                ", fnavn='" + fnavn + '\'' +
                ", enavn='" + enavn + '\'' +
                ", adresse='" + adresse + '\'' +
                ", ansættelsesdato='" + ansættelsesdato + '\'' +
                ", afdelingsNummer='" + afdelingsNummer + '\'' +
                '}';
    }
}
