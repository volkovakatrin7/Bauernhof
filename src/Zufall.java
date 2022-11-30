import java.util.Random;

public class Zufall {
    static Random r = new Random();

    // Preise
    public static int kuhPreis(){
        return r.nextInt(500, 751);
    }

    public static int schafPreis(){
        return r.nextInt(300, 401);
    }

    public static int ziegePreis(){
        return r.nextInt(250, 351);
    }

    public static int huhnPreis(){
        return r.nextInt(40, 61);
    }

    // Produktmengen
    public static int milchLiter(){
        return r.nextInt(20, 31);
    }

    public static int ziegeMilchLiter(){
        return r.nextInt(10, 16);
    }

    public static int wolleKg(){
        return r.nextInt(5, 10);
    }

    public static int eiStueck(){
        return r.nextInt(1, 3);
    }

    // Produktpreise
    public static int kuhMilchPreis(){
        return r.nextInt(3, 6);
    }

    public static int ziegeMilchPreis(){
        return r.nextInt(7, 10);
    }

    public static int wollePreis(){ return r.nextInt(12, 19); }

    public static int eiPreis(){
        return r.nextInt(2, 3);
    }

    public static void printAktuellePreise(int preisKuh, int preisSchaf, int preisZiege, int preisHuhn){
        System.out.println("Aktuelle Preise:");
        System.out.println("Kuh: " + preisKuh + " Euro. Unterhalt monanlich: 75 Euro");
        System.out.println("Schaf: " + preisSchaf + " Euro. Unterhalt monanlich: 55 Euro");
        System.out.println("Ziege: " + preisZiege + " Euro. Unterhalt monanlich: 40 Euro");
        System.out.println("Huhn: " + preisHuhn + " Euro. Unterhalt monanlich: 10 Euro");
        System.out.println("\n");
    }
}
