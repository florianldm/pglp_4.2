package florianldm;

public enum Operation {
    /** Opération +. */
    PLUS("+") {
        /**
         * Evaluation PLUS.
         * @param operande1 .
         * @param operande2 .
         * @return double.
         */
        public double eval(final double operande1, final double operande2) {
            return operande1 + operande2;
        }
    },

    /** Opération -. */
    MOINS("-") {
        /**
         * Evaluation MOINS.
         * @param operande1 .
         * @param operande2 .
         * @return double.
         */
        public double eval(final double operande1, final double operande2) {
            return operande2 - operande1;
        }
    },

    /** Opération *. */
    MULT("*") {
        /**
         * Evaluation MULT.
         * @param operande1 .
         * @param operande2 .
         * @return double.
         */
        public double eval(final double operande1, final double operande2) {
            return operande1 * operande2;
        }
    },

    /** Opération /. */
    DIV("/") {
        /**
         * Evaluation DIV.
         * @param operande1 .
         * @param operande2 .
         * @return double.
         */
        public double eval(final double operande1, final double operande2) {
            return operande2 / operande1;
        }
    };

    /** Symbole. */
    private String symbole;

    /**
     * Constructeur.
     * @param symbole1 type.
     */
    Operation(final String symbole1) {
        this.symbole = symbole1;
    }

    /**
     * Retourne le symbole de l'opération.
     * @return .
     */
    private String getSymbole() {
        return symbole;
    }

    /**
     * Effectue l'opération entre deux opérandes.
     * @param operande1 .
     * @param operande2 .
     * @return résultat en Double.
     */
    public abstract double eval(double operande1, double operande2);
}
