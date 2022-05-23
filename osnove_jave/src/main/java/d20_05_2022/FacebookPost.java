package d20_05_2022;

public class FacebookPost {
    //Od atributa:
    //ime i prezime korisnika koji je objavio post
    //ime i prezime korisnika na kom je profilu objavljen post
    // (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
    //tekst objave
    //broj lajkova
    //broj deljenja

    String nameOfPostOwner;
    String nameOfProfileOwner;
    String text;
    int likes;
    int share;

    //Konstruktore:
    //difoltni konstuktor
    //konstuktor koji postavlja ime i prezime korisnika ko je objavio,
    // korisnika na kom je profilu objavnljen i tekst objave

    public FacebookPost() {
    }

    public FacebookPost(String nameOfPostOwner, String nameOfProfileOwner, String text) {
        this.nameOfPostOwner = nameOfPostOwner;
        this.nameOfProfileOwner = nameOfProfileOwner;
        this.text = text;
    }

    //  Od metoda:
    //like(), koja povecava broj lajkova za 1.
    //dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
    //share(), koja povecava broj deljenja za 1
    //print(), koja stampa objavu u formatu:
    //(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
    //(tekst objave)
    //Likes (broj lajkova) | Shares (broj deljenja)

    public void like() {
        this.likes++;
    }

    public void dislike() {
        this.likes--;
        if (this.likes < 0) {
            this.likes = 0;
        }
    }

    public void increaseShare() {
        this.share++;
    }

    public void print() {
        System.out.println(this.nameOfPostOwner + " >>>> " + this.nameOfProfileOwner);
        System.out.println(this.text);
        System.out.println("Likes " + this.likes + " | Shares " + this.share);

    }
}



