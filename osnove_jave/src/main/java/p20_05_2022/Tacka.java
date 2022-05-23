package p20_05_2022;

public class Tacka {
   //Za klasu Tacka, koja ima privatne atribute:
    //x - x koordinata
    //y - y koordinata
    //metodu stampaj
    //imamo difoltni konstruktor
    //imamo konstuktor koji prima obe koordinate za kreiranje objekta
    //U glavnom programu kreirati objekte

    int x;
    int y;

    public Tacka(){ }

    public Tacka(int x, int y) {
        this.x = x;
        this.y = y;
    }

        public void stampa(){
            System.out.println("X kordinata iznosi: " + this.x + ",a Y osa je: " + this.y);
    }
}
