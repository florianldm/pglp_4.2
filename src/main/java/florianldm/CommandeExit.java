package florianldm;

public class CommandeExit implements Icommande {
    /** Interpreteur pour lequel on appelle des méthodes. */
    private Interpreteur interpreteur;
    /** Nom de la commande. */
    public final String nom = "CommandeExit";

    /**
     * Constructeur de la commande.
     * @param i l'interpreteur.
     */
    public CommandeExit(Interpreteur i) {
        this.interpreteur = i;
    }

    /**
     * Méthode qui exécute la commande de fermeture.
     * S'ajoute dans l'historique de l'interpreteur.
     */
    @Override
    public void execute() {
        this.interpreteur.quit();
        this.interpreteur.add(this);
    }
}
