package florianldm;

public class CommandeExit implements Icommande {
    /** Interpreteur pour lequel on appelle des méthodes. */
    private Interpreteur interpreteur;

    /**
     * Constructeur de la commande.
     * @param i l'interpreteur.
     */
    public CommandeExit(Interpreteur i) {
        this.interpreteur = i;
    }

    /**
     * Méthode qui exécute la commande de fermeture.
     */
    @Override
    public void execute() {
        this.interpreteur.quit();
    }
}
