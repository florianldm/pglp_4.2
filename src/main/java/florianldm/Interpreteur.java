package florianldm;

import java.util.ArrayList;

/**
 * Receiver.
 */
public class Interpreteur {
    /** Liste des commandes utilisées.*/
    private ArrayList<Icommande> commandes;

    /**
     * Constructeur.
     */
    public Interpreteur() {
        commandes = new ArrayList<>();
    }
    /**
     * Supprime la dernière commande de l'historique.
     */
    public void undo() {
        if (!this.commandes.isEmpty()) {
            this.commandes.remove(this.commandes.size() - 1);
        }
    }

    /**
     * Quitte le programme.
     */
    public void quit() {
        System.out.println("Fermeture du programme");
        System.exit(1);
    }

    /** Ajout d'une commande dans l'historique.
     * @param c commande à ajouter dans historique.
     */
    public void add(final Icommande c) {
        this.commandes.add(c);
    }

    /**
     * Check si l'historique est vide.
     * @return vrai ou faux.
     */
    public boolean checkEmpty() {
        return this.commandes.isEmpty();
    }


}
