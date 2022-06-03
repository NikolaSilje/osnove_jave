package d31_05_2022;


    public class Igrac extends Osoba{
        private int broj;
        private String pozicija;
        private boolean daLiJeKapiten;

        public Igrac() {
        }

        public Igrac(String ime, String prezime, String jmbg, int godinaRodj, int broj, String pozicija, boolean daLiJeKapiten) {
            super(ime, prezime, jmbg, godinaRodj);
            this.broj = broj;
            this.pozicija = pozicija;
            this.daLiJeKapiten = daLiJeKapiten;
        }

        public int getBroj() {
            return broj;
        }

        public void setBroj(int broj) {
            this.broj = broj;
        }

        public String getPozicija() {
            return pozicija;
        }

        public void setPozicija(String pozicija) {
            this.pozicija = pozicija;
        }

        public boolean isDaLiJeKapiten() {
            return daLiJeKapiten;
        }

        public void setDaLiJeKapiten(boolean daLiJeKapiten) {
            this.daLiJeKapiten = daLiJeKapiten;
        }
        @Override
        public void stampaj(){
            super.stampaj();
            System.out.println("Broj na dresu: " + this.broj);
            System.out.println("Pozicija: " + this.pozicija);
            if (this.daLiJeKapiten) {
                System.out.println("Kapiten");
            } else {
                System.out.print("");
            }
            System.out.println();

        }
    }



