package p18_05_2022;

public class slackMessageMain {
    public static void main(String[] args) {
        //    //U glavnom programu kreirati 2 slack poruke sa proizvoljnim podacima i ostampati obe poruke u formatu:
        //    //[ime i prezime osobe] - [kad je poslata]
        //    //[Tekst poruke]
        //    //
        SlackMessage ime1 = new SlackMessage();
        SlackMessage ime2 = new SlackMessage();

        ime1.imeIPrezime = "Nikola Vasiljevic";
        ime1.datumIVreme = "24.12.2022 - 13:23";
        ime1.tekstPoruke = "Cao, sta se radi?";

        ime2.imeIPrezime = "Nikola Nikolic";
        ime2.datumIVreme = "24.12.2022 - 13:25";
        ime2.tekstPoruke = "Evo nista, ti?";

        System.out.println(ime1.imeIPrezime + " - " + ime1.datumIVreme);
        System.out.println(ime1.tekstPoruke);
        System.out.println(ime2.imeIPrezime + " - " + ime2.datumIVreme);
        System.out.println(ime2.tekstPoruke);

    }
}
