public class Admmedarbejder extends Ansat{

    String uddanelse;

    String ansættelsesgrad;

    int timeløn;

    public Admmedarbejder() {
    }

    public Admmedarbejder(String uddanelse, String ansættelsesgrad, int timeløn) {
        this.uddanelse = uddanelse;
        this.ansættelsesgrad = ansættelsesgrad;
        this.timeløn = timeløn;
    }

    public Admmedarbejder(int medarbejderNr, String fnavn, String enavn, String adresse, String ansættelsesdato, String afdelingsNummer, String uddanelse, String ansættelsesgrad, int timeløn) {
        super(medarbejderNr, fnavn, enavn, adresse, ansættelsesdato, afdelingsNummer);
        this.uddanelse = uddanelse;
        this.ansættelsesgrad = ansættelsesgrad;
        this.timeløn = timeløn;
    }

    public String getUddanelse() {
        return uddanelse;
    }

    public void setUddanelse(String uddanelse) {
        this.uddanelse = uddanelse;
    }

    public String getAnsættelsesgrad() {
        return ansættelsesgrad;
    }

    public void setAnsættelsesgrad(String ansættelsesgrad) {
        this.ansættelsesgrad = ansættelsesgrad;
    }

    public int getTimeløn() {
        return timeløn;
    }

    public void setTimeløn(int timeløn) {
        this.timeløn = timeløn;
    }

    @Override
    public String toString() {
        return "Admmedarbejder{" +
                "uddanelse='" + uddanelse + '\'' +
                ", ansættelsesgrad='" + ansættelsesgrad + '\'' +
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
