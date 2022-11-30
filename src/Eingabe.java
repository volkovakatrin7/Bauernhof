import java.util.InputMismatchException;
import java.util.Scanner;

public class Eingabe {
    static Scanner sc = new Scanner(System.in);

    public static int getInt() {
        int i = 0;
        do {
            try {
                i = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Bitte Ihre Eingabe überprüfen");
                sc.nextLine();
                i = getInt();
            }
            if (i < 0) {
                System.out.println("Bitte Ihre Eingabe überprüfen");
            }
        } while (i < 0);
        return i;
    }
}
