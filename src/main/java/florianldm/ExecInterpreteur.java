package florianldm;

/**
 * Rôle du client qui utilise un invoke pour faire une action.
 */
public class ExecInterpreteur {
    /** Invoke qui déclenche l'action.
     *  Soit de type CommandeExit soit CommandeUndo.
     */
    private Icommande i;

    /**
     * Constructeur (rôle du client).
     * @param i1 Invoke.
     */
    public ExecInterpreteur(final Icommande i1) {
        this.i = i1;
    }

    /** Execution de l'action par le client. */
    public void declencheAction() {
        this.i.execute();
    }
}
