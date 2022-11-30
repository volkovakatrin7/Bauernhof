import java.util.ArrayList;

public class Buchung {
    public static ArrayList <Buchung> buchhaltung = new ArrayList<>();

    private int runde;
    private int eintrag;

    public Buchung (int runde, int eintrag){
        this.runde = runde;
        this.eintrag = eintrag;
        buchhaltung.add(this);
    }

    public int getEintrag(){
        return eintrag;
    }

    public static int unterhaltsKostenAbziehen(int runde){
        int kosten = 0;
        for (Tier tier : Tier.tiere){
            kosten += Math.abs(tier.getUnterhalt());
            new Buchung(runde, tier.getUnterhalt());
        }
        return kosten;
    }

    public static int getGeldVerfuegbar(){
        int geld = 0;
        for (Buchung buchung : buchhaltung){
            geld += buchung.getEintrag();
        }
        return geld;
    }
}
