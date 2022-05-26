package d24_05_2022.ZeleniKarton;

public class ZeleniKarton {
    //Zadatak
    //Kreirati klasu ZeleniKarton koja ima:
    //ime i prezime studenta
    //broj indeksa
    //naziv predmeta
    //ime i prezime profesora
    //ocenu - od 5 do 10
    //gettere i settere
    //konstruktore

    private String punoImeStudenta;
    private String brojIndeksa;
    private String nazivPredmeta;
    private String punoimeProfesora;
    private int ocena;

    public ZeleniKarton() {
    }

    public ZeleniKarton(String punoImeStudenta, String nazivPredmeta,
                        String punoimeProfesora,String brojIndeksa, int ocena) {

        this.punoImeStudenta = punoImeStudenta;
        this.nazivPredmeta = nazivPredmeta;
        this.punoimeProfesora = punoimeProfesora;
        this.brojIndeksa = brojIndeksa;
        this.ocena = ocena;
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

    public String getPunoImeStudenta() {
        return punoImeStudenta;
    }

    public String getBrojIndeksa() {
        return brojIndeksa;
    }

    public String getPunoimeProfesora() {
        return punoimeProfesora;
    }
    //metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)

    public boolean ispitJePolozen() {
        return this.ocena > 5;
        }

    //metodu stampaj koja stampa podatke u formatu:
    //		(naziv predmeta) - (ocena)
    //		Student: ime i prezime, broj indeksa
    //		Profesor: ime i prezime

    public void stampa(){
        System.out.println(this.nazivPredmeta + " - " + this.ocena);
        System.out.println("Student: " + this.punoImeStudenta +  ", " + this.brojIndeksa);
        System.out.println("Profesor: " + this.punoimeProfesora);
    }
}
