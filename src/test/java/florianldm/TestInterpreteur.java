package florianldm;

import org.junit.*;

public class TestInterpreteur {
    /**
     * Test de l'implémentation d'un interpreteur.
     */

    /** Interpreteur. */
    Interpreteur i;
    /** Commande à executer. */
    Icommande c;
    /** Le client. */
    ExecInterpreteur e;

    /**
     * Initialisation interp. + cmd + client.
     */
    @Before
    public void init() {
        i = new Interpreteur();
        c = new CommandeUndo(i);
        e = new ExecInterpreteur(c);
    }

    /** Test d'execution d'une commande.
     *
     */
    @Test
    public void testInterpreteur() {
        e.declencheAction();
        Assert.assertFalse(i.checkEmpty());
    }

}
