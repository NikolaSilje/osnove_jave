package d16_05_2022;

public class dodatni_zadatak {
//    //Zadatak Obrni okreni
//Napisati metodu koja vraca obrnuti string od onog koji je prosledjen.
//Poziv metode:
//Ako se metoda pozove sa prosledjenom vrednoscu IT Bootcamp metoda vraca pmactooB TI
//Primer pozvia bi bio: String obrnut = obrniString("IT Bootcamp");
//Pomoc: Bilo kom karakteru iz stringa mozete pristupiti koristeci metodu charAt(int index)
    public static void main(String[] args) {
        String obrnut = obrniString("IT Bootcamp");
        System.out.println(obrnut);

    }

    static String obrniString(String biloSta) {
        String povratniObrnuti = "";
        for (int i = biloSta.length() - 1; i >= 0; i--) {
            povratniObrnuti = povratniObrnuti + biloSta.charAt(i);
        }
        return povratniObrnuti;

    }}









//    public static void main(String[] args) {
//
//                String str = "BeginnersBook";
//                for(int i = str.length() -1; i >= 0; i--) {
//                    System.out.print(str.charAt(i));
//                }
//            }
//        }


