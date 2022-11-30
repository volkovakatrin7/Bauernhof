import java.util.ArrayList;

public class Produkt {
    public static ArrayList<Produkt> produkte = new ArrayList<>();
    private int menge;
    private String typ;

    public Produkt(String typ){
        this.menge = 0;
        this.typ = typ;
        produkte.add(this);
    }

    public int getMenge() {
        return menge;
    }

    public void setMenge(int aenderung){
        this.menge = this.menge + aenderung;
    }


    public void updateProdukt (Tier tier){
        if (tier.getClass().getSimpleName() == "Kuh" && this.typ.equals("kuhMilch")) {
            int liter = Zufall.milchLiter();
            this.setMenge(liter);
        }
        else if (tier.getClass().getSimpleName() == "Schaf" && this.typ.equals("wolle")) {
            this.setMenge(Zufall.wolleKg());
        }
        else if (tier.getClass().getSimpleName() == "Ziege" && this.typ.equals("ziegeMilch")) {
            this.setMenge(Zufall.ziegeMilchLiter());
        }
        else if (tier.getClass().getSimpleName() == "Huhn" && this.typ.equals("eier")) {
            this.setMenge(Zufall.eiStueck());
        }
    }
}
