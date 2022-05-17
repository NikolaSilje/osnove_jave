package d16_05_2022;

public class zadatak1 {
    public static void main(String[] args) {
//Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa prosledjena vrednost za 10 veca.
// Iz main-a pozvati izvrsenje metode za razlicite vrednosti.

        zaDesetVecu(2);
        zaDesetVecu(80);
        zaDesetVecu(50);
    }
    static void zaDesetVecu (int a){
        a = a + 10;
        System.out.println("Vrednost koja je za 10 veca od unete vrednosti je: " + a);
    }
}
