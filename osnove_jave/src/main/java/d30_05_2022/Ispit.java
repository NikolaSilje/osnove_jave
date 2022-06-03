package d30_05_2022;

public class Ispit {
    private String nazivPredmeta;
    private int ocena;
    private String imePrezimeProfesora;

    public Ispit(String nazivPredmeta, int ocena, String imePrezimeProfesora) {
        this.nazivPredmeta = nazivPredmeta;
        this.ocena = ocena;
        this.imePrezimeProfesora = imePrezimeProfesora;
    }

    public Ispit() {
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public String getImePrezimeProfesora() {
        return imePrezimeProfesora;
    }

    public void setImePrezimeProfesora(String imePrezimeProfesora) {
        this.imePrezimeProfesora = imePrezimeProfesora;
    }

    public boolean polozenIspit() {
        if (this.ocena > 5 && this.ocena < 11) {
            return true;
        }
        return false;
    }

    public void stampaj() {
        System.out.println(this.nazivPredmeta + " - " + this.imePrezimeProfesora + " - " + this.ocena);
    }
}
