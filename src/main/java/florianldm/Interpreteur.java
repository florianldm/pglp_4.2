package florianldm;

import java.util.ArrayList;

/**
 * Receiver.
 */
public class Interpreteur {
    /** Liste des commandes utilisées*/
    private ArrayList<Icommande>Commandes;

    /**
     * Constructeur.
     */
    public Interpreteur() {
        Commandes = new ArrayList<>();
    }
    /**
     * Supprime la dernière commande de l'historique.
     */
    public void undo() {
        this.Commandes.remove(this.Commandes.size()-1);
    }

    /**
     * Quitte le programme.
     */
    public void quit() {
        System.out.println("Fermeture du programme");
        System.exit(1);
    }

    /** Ajout d'une commande dans l'historique. */
    public void add(Icommande c) {
        this.Commandes.add(c);
    }


}