package d03_06_2022;

public class MainAmbalaza {
    public static void main(String[] args) {

        //U glavnom programu kreirati jednu Korpu i u nju dodati nekoliko
        // Ambalaza razlicitih tipova i istestirati sve metode i ispisati ukupnu cenu sa popustom.

        Korpa korpa = new Korpa();

        StaklenaAmbalaza zajecarac = new StaklenaAmbalaza("12345", "Zajecarsko",
                0.5, 0.7, 18, true, 55);


        StaklenaAmbalaza cc = new StaklenaAmbalaza("54321", "Coca Cola",
                0.33, 0.5, 0,false, 70);


        Tetrapak mleko = new Tetrapak("54891", "Imlek", 1,
                1.1,true,100);


        Tetrapak cokoladno = new Tetrapak("54891", "Cokoladno Mleko", 0.9,
                1.2,false,140);

        SuperKartica nikola = new SuperKartica("5566-9994-5687", "Nikola Vasiljevic", 50);

        korpa.dodajAmbalazu(zajecarac);
        korpa.dodajAmbalazu(cc);
        korpa.dodajAmbalazu(mleko);
        korpa.dodajAmbalazu(cokoladno);

        korpa.izbaciAmbalazu("12345");


        for (int i = 0; i < korpa.getAmbalaze().size(); i++) {
            korpa.getAmbalaze().get(i).stampaj();

        }
        nikola.stampaj();
        System.out.println();
        System.out.println("Ukupna cena korpe je: " + korpa.ukupnuCenu(nikola));



        //U glavnom programu kreirati jednu Korpu i u nju dodati nekoliko Ambalaza
        // razlicitih tipova i istestirati sve metode i ispisati ukupnu cenu sa popustom.




    }
}
