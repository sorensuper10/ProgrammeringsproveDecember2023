public class Leder extends Ansat{

     int ledernivaeu;
     int månedsløn;

    public Leder() {
    }

    public Leder(int ledernivaeu, int månedsløn) {
        this.ledernivaeu = ledernivaeu;
        this.månedsløn = månedsløn;
    }

    public Leder(int medarbejderNr, String fnavn, String enavn, String adresse, String ansættelsesdato, String afdelingsNummer, int ledernivaeu, int månedsløn) {
        super(medarbejderNr, fnavn, enavn, adresse, ansættelsesdato, afdelingsNummer);
        this.ledernivaeu = ledernivaeu;
        this.månedsløn = månedsløn;
    }

    public int getLedernivaeu() {
        return ledernivaeu;
    }

    public void setLedernivaeu(int ledernivaeu) {
        this.ledernivaeu = ledernivaeu;
    }

    public int getMånedsløn() {
        return månedsløn;
    }

    public void setMånedsløn(int månedsløn) {
        this.månedsløn = månedsløn;
    }

    @Override
    public String toString() {
        return "Leder{" +
                "ledernivaeu=" + ledernivaeu +
                ", månedsløn=" + månedsløn +
                ", medarbejderNr=" + medarbejderNr +
                ", fnavn='" + fnavn + '\'' +
                ", enavn='" + enavn + '\'' +
                ", adresse='" + adresse + '\'' +
                ", ansættelsesdato='" + ansættelsesdato + '\'' +
                ", afdelingsNummer='" + afdelingsNummer + '\'' +
                '}';
    }
}
