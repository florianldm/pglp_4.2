package florianldm;

public class CommandeOperation implements IcommandeRPN {
    /** MoteurRPN pour lequel on appelle des méthodes. */
    private MoteurRPN moteur;
    /** Nom de la commande. */
    private final String nom = "CommandeSaveOperation";
    /** Opération à effectuer. */
    private Operation operation;

    /**
     * Constructeur de la commande.
     * @param m moteurRPN.
     * @param ope operation à faire.
     */
    public CommandeOperation(final MoteurRPN m, final Operation ope) {
        this.moteur = m;
        this.operation = ope;
    }

    /**
     * Méthode qui exécute la commande de calcul.
     */
    @Override
    public void execute() {
        this.moteur.makeOperation(this.operation);
    }

    /**
     * Getter.
     * @return nom commande.
     */
    public String getNom() {
        return nom;
    }
}
