package d18_05_2022;

public class SmartAirConditioning {
    //atribut za marku klime (npr: Samsung, Galanz, Gree, …)
    //atribut za izabranu temperaturu (minimum je 16, maksimum 35)
    //atribut za mod (hladi/greje)
    //metodu za stampu - stampa u formatu: Proizvoljno :)

    public String brendName;
    public int temperature;
    public String mode;

    public static void stamp(String name, int temp, String mod) {
        System.out.println("Please try some of air conditions how its work");
        System.out.println("Choose brend: " + name);
        System.out.println("Please choose mode: " + mod);
        System.out.println("Please select the appropriate temperature: " + temp);
    }
}
