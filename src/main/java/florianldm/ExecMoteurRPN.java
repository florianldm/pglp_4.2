package florianldm;

public class ExecMoteurRPN {
    /** Commande. */
    private IcommandeRPN i;

    /**
     * Constructeur.
     * @param i1 commande.
     */
    public ExecMoteurRPN(final IcommandeRPN i1) {
        this.i = i1;
    }

    /**
     * Déclenche l'action de la commande.
     */
    public void declencheAction() {
        this.i.execute();
    }

}
