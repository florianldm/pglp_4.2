package florianldm;
import java.util.Scanner;

final class SaisieRPN {
    /** Scanner. */
    private Scanner scanner;
    /** Scanner2. */
    private Scanner scanner2;
    /** MoteurRPN. */
    IcommandeRPN i;

    /**
     * Constructeur.
     */
    SaisieRPN() {
        this.scanner = new Scanner(System.in, "UTF-8");
        this.scanner2 = new Scanner(System.in, "UTF-8");
    }

    /**
     * Getter.
     * @return scanner.
     */
    Scanner getScanner() {
        return scanner;
    }

    /**
     * Getter.
     * @return scanner2.
     */
    Scanner getScanner2() {
        return scanner2;
    }
}
