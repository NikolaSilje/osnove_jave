package d16_05_2022;

public class zadatak2 {
//Napisati funkciju koja za dva jednocifrena broja koja su ulazni parametri
//funkcije vraca novu vrednost koja se formira kao na primeru:
//ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
//ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.
//    public static void main(String[] args) {
//    public static void main(String[] args) {
//        novaVrdenost(2, 2);
//        novaVrdenost(7, 3);
//    }
//    static void novaVrdenost(int a, int b) {
//        System.out.println("Ako je prvi broj =" + a + ", a drugi =" + b + " vraca novu vrednost " + a + "" + b);
//    }
//}
//    II nacin
    public static void main(String[] args) {
        System.out.println(novaVrednost(1, 3));
        System.out.println(novaVrednost(8, 8));

    }
    static int novaVrednost (int a, int b){
        return a * 10 + b;
    }
}



