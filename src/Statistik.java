public class Statistik {

    public static void printKapital(int runde){
        System.out.println("" + runde + ". Runde");

        int geld = Buchung.getGeldVerfuegbar();
        System.out.println("Geld verfügbar: " + geld + " Euro");

        int unterhaltsKosten = Buchung.unterhaltsKostenAbziehen(runde);
        geld = Buchung.getGeldVerfuegbar();
        System.out.println(("Minus Unterhaltskosten in Höhe von " + unterhaltsKosten + " Euro"));
        System.out.println("Netto Geld verfügbar: " + geld + " Euro\n");
    }

    public static void printTiere(){
        System.out.println("Sie haben derzeit:");
        int anzahlKuehe = 0;
        int anzahlSchaefe = 0;
        int anzahlZiegen = 0;
        int anzahlHuener = 0;
        for (Tier tier : Tier.tiere){
            if (tier.getClass().getSimpleName() == "Kuh") {
                anzahlKuehe += 1;
            }
            else if (tier.getClass().getSimpleName() == "Schaf") {
                anzahlSchaefe += 1;
            }
            if (tier.getClass().getSimpleName() == "Ziege") {
                anzahlZiegen += 1;
            }
            if (tier.getClass().getSimpleName() == "Huhn") {
                anzahlHuener += 1;
            }
        }
        System.out.println("" + anzahlKuehe + " Kühe");
        System.out.println("" + anzahlSchaefe + " Schäfe");
        System.out.println("" + anzahlZiegen + " Ziegen");
        System.out.println("" + anzahlHuener + " Hüner");
        System.out.println("\n");
    }

    public static void printProdukte(Produkt milch, Produkt wolle, Produkt ziegenMilch, Produkt eier){
        System.out.println("" + milch.getMenge() + " Liter Milch");
        System.out.println("" + wolle.getMenge() + " kg Wolle");
        System.out.println("" + ziegenMilch.getMenge() + " Liter Ziegenmilch");
        System.out.println("" + eier.getMenge() + " Stück Eier");
        System.out.println("\n");
    }
}
