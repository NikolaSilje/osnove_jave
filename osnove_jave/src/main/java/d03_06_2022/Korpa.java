package d03_06_2022;


import java.util.ArrayList;

public class Korpa {
    //Kreirati klasu Korpa koja ima:
    //niz ambalaza
    //metodu dodaj ambalazu





    private ArrayList<Ambalaza> ambalaze = new ArrayList<Ambalaza>();

    public ArrayList<Ambalaza> getAmbalaze() {
        return ambalaze;
    }

    public void setAmbalaze(ArrayList<Ambalaza> ambalaze) {
        this.ambalaze = ambalaze;
    }

    //metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti

    public void dodajAmbalazu(Ambalaza nazivArtikla){
        this.ambalaze.add(nazivArtikla);
    }

    public void izbaciAmbalazu(String barKod){
        for (int i = 0; i < this.ambalaze.size(); i++) {
            if(ambalaze.get(i).getBarkod().equals(barKod)){
                this.ambalaze.remove(i);
            }

        }
    }
    //  metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze),
    // kao parametar funkcije se prima Super karticu iz koje se cita popust.

    public double ukupnuCenu(SuperKartica popust){
        double suma = 0;

        for (int i = 0; i < this.ambalaze.size(); i++) {
            suma += this.ambalaze.get(i).cenaArtikla();
        }return suma - popust.getPopust();
    }


}
