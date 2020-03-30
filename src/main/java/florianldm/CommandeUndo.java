package florianldm;

public class CommandeUndo implements Icommande {
    /** L'interpreteur. */
    private Interpreteur interpreteur;

    /**
     * Constructeur de la commande.
     * @param i l'interpreteur.
     */
    public CommandeUndo(final Interpreteur i) {
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

    /**
     * Getter.
     * @return nom commande.
     */
    public String getNom() {
        return "CommandeUndo";
    }
}
