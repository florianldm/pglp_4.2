package florianldm;

public class CommandeUndo implements Icommande {
    /** L'interpreteur. */
    private Interpreteur interpreteur;

    /**
     * Constructeur de la commande.
     * @param i l'interpreteur.
     */
    public CommandeUndo(Interpreteur i) {
        this.interpreteur = i;
    }

    /**
     * Execute commande undo chez interpreteur.
     */
    @Override
    public void execute() {
        this.interpreteur.undo();
    }
}
