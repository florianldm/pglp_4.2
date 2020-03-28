package florianldm;

public class CommandeUndo implements Icommande {
    /** L'interpreteur. */
    private Interpreteur interpreteur;
    /** Nom de la commande. */
    public final String nom = "CommandeUndo";

    /**
     * Constructeur de la commande.
     * @param i l'interpreteur.
     */
    public CommandeUndo(Interpreteur i) {
        this.interpreteur = i;
    }

    /**
     * Execute commande undo chez interpreteur.
     * S'ajoute dans l'historique de l'interpreteur.
     */
    @Override
    public void execute() {
        this.interpreteur.undo();
        this.interpreteur.add(this);
    }
}
