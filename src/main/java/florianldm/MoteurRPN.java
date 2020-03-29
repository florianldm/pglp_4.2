package florianldm;

import java.util.Stack;

public class MoteurRPN {
    /** Pile contenant les opérandes. */
    private Stack<Double> operandes;

    /**
     * Constructeur MoteurRPN.
     */
    public MoteurRPN() {
        this.operandes = new Stack<>();
    }

    /**
     * Ajout d'une opérande dans la pile.
     * @param o opérande.
     */
    public void addOperande(final double o) {
        Double d = o;
        this.operandes.push(d);
    }

    /**
     * Effectue une opération sur les deux opérandes.
     * @param operation operation à effectuer.
     * @return résultat dans la pile opérandes.
     */
    public double makeOperation(final Operation operation) {
        Double ope = this.operandes.pop();
        Double ope2 = this.operandes.pop();
        return this.operandes.push(operation.eval(ope, ope2));
    }

    /**
     * Retourne l'ensemble des opérandes de la pile.
     * @return .
     */
    public Stack<Double> getOperandes() {
        return this.operandes;
    }
}
