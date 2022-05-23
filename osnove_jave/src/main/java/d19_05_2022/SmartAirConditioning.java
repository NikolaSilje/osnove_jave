package d19_05_2022;

public class SmartAirConditioning {
    //atribut za marku klime (npr: Samsung, Galanz, Gree, …)
    //atribut za potrosnju elektricne energije dok hladi (npr 1kW/h)
    //atribut za potrosnju elektricne energije dok greje (npr 2kW/h)
    //atribut za izabranu temperaturu (minimum je 16, maksimum 35)
    //atribut za mod (hladi/greje)

    public String markaKlime;

    public double potrosnjaHladjenje;

    public double potrosnjaGrejanje;

    public double temperature;
    public String mod;

    public void stamp() {
        System.out.println( this.markaKlime + " - " + this.mod + " - " + this.temperature);
    }
    //metodu koja racuna mesecnu potrosnju u kW/h, po formuli:
    //30 * 15 * potrosnja po satu ( zavisi da li greje ili hladi)

    public double mesecnaPotrosnjaUKw(){
        if(this.mod.equals("greje")){
            return 30 * 15 * this.potrosnjaGrejanje;
        }
        return 30 * 15 * this.potrosnjaHladjenje;
    }
    //metodu koja racuna koliko klima novca potrosi za mesec dana
    //Prvih 350 kW/h su u zelenoj zoni i 1 kW/h kosta 6din
    //Sve ostalo se racuna kao u plavoj zoni, gde 1kW/h kosta 9 dinara
    //Metoda vraca ukupnu cenu za taj mesec

    public double mesecnaPotrosnjaUNovcu(){
        double plavaFaza = (this.mesecnaPotrosnjaUKw() - 350) * 9;
        double zelenaFaza = 350 * 6;
        return plavaFaza + zelenaFaza;
        }

    }


