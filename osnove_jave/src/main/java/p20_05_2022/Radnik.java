package p20_05_2022;

public class Radnik {
    //jmbg radnika
    //ime i prezime
    //broj dece (1,2,3,... ili 0 ako nema dece)
    //stepen strucne spreme (od 1 do 8)
    //godine radnog staza
    //konstuktor koji postavlja samo jmbg
    //konstuktor koji postavlja sve atribute
    //metodu koja racuna i vraca minuli rad(Ima ispod kako se racuna)
    //metodu koja vraca koeficijent slozenosti (Ima ispod kako se racuna)
    //metodu koja racuna platu radnika, plata se racuna po formuli:
    //25000 + (koeficijent slozenosti + minuli rad) * 10000
    //metodu koja vraca da li je zaposleni kreditno sposoban. (Kreditno je sposoban ako je plata veca od 50 000)
    //metodu koja racuna i vraca koliko slobodnih dana radnik ima za tekucu godinu.Svaki radnik

    String jmbg;
    String imeIPrezime;
    int brojDece;
    int stepenStrucneSpremnosti;
    int godineRadnogStaza;

    public Radnik(){ }


    public Radnik(String jmbg) {
        this.jmbg = jmbg;
    }
    public Radnik(String jmbg,String imeIPrezime, int brojDece, int stepenStrucneSpremnosti, int godineRadnogStaza){
        this.jmbg = jmbg;
        this.imeIPrezime = imeIPrezime;
        this.brojDece = brojDece;
        this.stepenStrucneSpremnosti = stepenStrucneSpremnosti;
        this.godineRadnogStaza = godineRadnogStaza;
    }

    //Minuli rad - zarada zaposlenog uvećava se za svaku započetu godinu radnog staža:
    //- do 10 godina 0.05
    //- od 10-20 godina 0.075
    //- preko 20 godina 0.1

    public double minuliRad(){
        if(godineRadnogStaza < 10){
            return godineRadnogStaza * 0.005;
        }else if(godineRadnogStaza > 10 && godineRadnogStaza < 20){
            return godineRadnogStaza * 0.075;
        }return godineRadnogStaza * 0.1;
    }
//Koeficijent slozenosti
//- (I stepen) Nekvalifikan radnik, koeficijent: 1,03;
//- (II stepen) Osnovno obrazovanje, koeficijent: 1,65;
//- (III stepen) Srednje obrazovanje u trajanju od dvije do tri god., koeficijent: 2,00;
//- (IV stepen) Kvalifikacija srednjeg opšteg i stručnog obrazovanja, koeficijent: 2,27;
//- (V stepen) Kvalifikacija višeg stručnog obrazovanja, koeficijent: 2,88;
//- (VI stepen) Visoko obrazovanje, koeficijent: 3,09;
//- (VII stepen) Fakultetsko, odnosno visoko obrazovanje - Bechelor, koeficijent: 3,40;
//- (VIII stepen) Doktorat nauka, koeficijent: 4,12.

    public double koeficijentiSlozenosti(){
        if(stepenStrucneSpremnosti == 1){
            return 1.03;
        }else if(stepenStrucneSpremnosti == 2) {
            return 1.65;
        }else if(stepenStrucneSpremnosti == 3) {
            return 2.00;
        }else if(stepenStrucneSpremnosti == 4) {
            return 2.27;
        }else if(stepenStrucneSpremnosti == 5) {
            return 2.88;
        }else if(stepenStrucneSpremnosti == 6) {
            return 3.09;
        }else if(stepenStrucneSpremnosti == 7) {
            return 3.40;
        }
            return 4.20;
    }
    //metodu koja racuna platu radnika, plata se racuna po formuli:
    //25000 + (koeficijent slozenosti + minuli rad) * 10000

    public double plataRanika(){
        return 25000 + (koeficijentiSlozenosti() + minuliRad()) * 10000;
    }
    //metodu koja vraca da li je zaposleni kreditno sposoban. (Kreditno je sposoban ako je plata veca od 50 000)

    public boolean jeKreditnoSposoban(){
        return plataRanika() > 50000;
    }
//metodu koja racuna i vraca koliko slobodnih dana radnik ima za tekucu godinu.
// Svaki radnik godisnje ima 22 radna dana, i za svako dete plus po 2 dana

    public int slobodniDani(){
        return 22 + (brojDece * 2);
    }



}
