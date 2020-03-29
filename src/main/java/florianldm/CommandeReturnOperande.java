package florianldm;

import java.util.Stack;

public class CommandeReturnOperande implements IcommandeRPN {
    /** MoteurRPN pour lequel on appelle des méthodes. */
    private MoteurRPN moteur;
    /** Nom de la commande. */
    private final String nom = "CommandeReturnOperande";
    /** Pile d'opérandes. */
    private Stack<Double> operandes;

    /**
     * Constructeur de la commande.
     * @param m moteurRPN.
     */
    public CommandeReturnOperande(final MoteurRPN m) {
        this.moteur = m;
        this.operandes = new Stack<>();
    }

    /**
     * Méthode qui exécute la commande d'enregistrement.
     */
    @Override
    public void execute() {
        this.operandes = this.moteur.getOperandes();
    }

    /**
     * Retourne la pile d'opérandes.
     * @return pile.
     */
    public Stack<Double> getPile() {
        return this.operandes;
    }

    /**
     * Getter.
     * @return nom commande.
     */
    public String getNom() {
        return nom;
    }
}
