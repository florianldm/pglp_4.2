package florianldm;
import java.util.Scanner;

public class SaisieRPN {
    /** Scanner. */
    private Scanner scanner;
    /** Scanner2. */
    private Scanner scanner2;
    /** MoteurRPN. */
    MoteurRPN M = new MoteurRPN();

    /**
     * Constructeur.
     */
    public SaisieRPN(){
        this.scanner = new Scanner(System.in);
        this.scanner2 = new Scanner(System.in);
    }

    /**
     * Getter.
     * @return scanner.
     */
    public Scanner getScanner() {
        return scanner;
    }

    /**
     * Getter.
     * @return scanner2.
     */
    public Scanner getScanner2() {
        return scanner2;
    }
}
