public class Main {
    public static void main(String[] args) {

        // Vorbereitung
        int runde = 0;

        new Buchung(0, 5000);

        Produkt kuhMilch = new Produkt("kuhMilch");
        Produkt wolle = new Produkt("wolle");
        Produkt ziegenMilch = new Produkt("ziegeMilch");
        Produkt eier = new Produkt("eier");

        boolean weiterSpielen = true;

        // Simulation
        do {
            runde ++;
            Statistik.printKapital(runde);
            Statistik.printTiere();
            for (Tier tier : Tier.tiere){
                for (Produkt produkt : Produkt.produkte){
                    produkt.updateProdukt(tier);
                }
            }

            Statistik.printProdukte(kuhMilch, wolle, ziegenMilch, eier);

            int preisKuh = Zufall.kuhPreis();
            int preisSchaf = Zufall.schafPreis();
            int preisZiege = Zufall.ziegePreis();
            int preisHuhn = Zufall.huhnPreis();
            Zufall.printAktuellePreise(preisKuh, preisSchaf, preisZiege, preisHuhn);

            if (Buchung.getGeldVerfuegbar() > 0) {
                System.out.println("Wie viele Kühe wollen Sie kaufen? ");
                int maxTiere = Eingabe.getInt();

                for (int i = 0; i < maxTiere; i++) {
                    Kuh tier = new Kuh();
                    new Buchung(runde, -preisKuh);
                    new Buchung(runde, tier.getUnterhalt());
                }
            }
            else{
                System.out.println("Sie haben nicht genug Geld. Game over");
                weiterSpielen = false;
            }

            if (Buchung.getGeldVerfuegbar() > 0) {
                System.out.println("Wie viele Schäfe wollen Sie kaufen? ");
                int maxTiere = Eingabe.getInt();

                for (int i = 0; i < maxTiere; i++) {
                    Schaf tier = new Schaf();
                    new Buchung(runde, -preisSchaf);
                    new Buchung(runde, tier.getUnterhalt());
                }
            }
            else{
                System.out.println("Sie haben nicht genug Geld. Game over");
                weiterSpielen = false;
            }

            if (Buchung.getGeldVerfuegbar() > 0) {
                System.out.println("Wie viele Ziegen wollen Sie kaufen? ");
                int maxTiere = Eingabe.getInt();

                for (int i = 0; i < maxTiere; i++) {
                    Ziege tier = new Ziege();
                    new Buchung(runde, -preisZiege);
                    new Buchung(runde, tier.getUnterhalt());
                }
            }
            else{
                System.out.println("Sie haben nicht genug Geld. Game over");
                weiterSpielen = false;
            }

            if (Buchung.getGeldVerfuegbar() > 0) {
                System.out.println("Wie viele Hüner wollen Sie kaufen? ");
                int maxTiere = Eingabe.getInt();

                for (int i = 0; i < maxTiere; i++) {
                    Huhn tier = new Huhn();
                    new Buchung(runde, -preisHuhn);
                    new Buchung(runde, tier.getUnterhalt());
                }
            }
            else{
                System.out.println("Sie haben nicht genug Geld. Game over");
                weiterSpielen = false;
            }

        } while (weiterSpielen);
    }
}