package florianldm;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestMoteurRPN {
    /**
     * Test de l'implémentation d'un MoteurRPN.
     */

    /** Moteur. */
    MoteurRPN m;
    /** Commande à executer. */
    IcommandeRPN c;
    /** Le client. */
    ExecMoteurRPN e;

    /**
     * Initialisation moteur. + cmd + client.
     */
    @Before
    public void init() {
        m = new MoteurRPN();
        c = new CommandeSaveOperande(m,5.);
        e = new ExecMoteurRPN(c);
    }

    /** Test d'execution d'une commande.
     *
     */
    @Test
    public void testMoteur() {
        e.declencheAction();
        Assert.assertFalse(m.getOperandes().empty());
    }
}
