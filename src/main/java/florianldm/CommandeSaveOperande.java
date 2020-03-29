package florianldm;

public class CommandeSaveOperande implements IcommandeRPN {
    /** MoteurRPN pour lequel on appelle des méthodes. */
    private MoteurRPN moteur;
    /** Nom de la commande. */
    private final String nom = "CommandeSaveOperande";
    /** Opérande à ajouter. */
    private Double operande;

    /**
     * Constructeur de la commande.
     * @param m moteurRPN.
     * @param ope operande.
     */
    public CommandeSaveOperande(final MoteurRPN m, final Double ope) {
        this.moteur = m;
        this.operande = ope;
    }

    /**
     * Méthode qui exécute la commande d'enregistrement.
     */
    @Override
    public void execute() {
        this.moteur.addOperande(this.operande);
    }
}
