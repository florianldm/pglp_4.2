package florianldm;

import java.util.Stack;

public class CalculatriceRPN {
    public static void main() {
        double nombre;
        String op;
        Operation operation = Operation.PLUS;
        SaisieRPN S = new SaisieRPN();

        System.out.println("Saisir un nombre");
        nombre = S.getScanner().nextDouble();

        MoteurRPN m = new MoteurRPN();
        IcommandeRPN iRPN = new CommandeSaveOperande(m, nombre);
        ExecMoteurRPN eRPN = new ExecMoteurRPN(iRPN);

        //Sauvegarde de l'opérande.
        S.M.declencheAction();

        System.out.println("Saisir le type d'operation");
        op = S.getScanner2().nextLine();

        System.out.println("Saisir le deuxieme nombre");
        nombre = S.getScanner().nextDouble();
        IcommandeRPN iRPN2 = new CommandeSaveOperande(m, nombre);

        S.M.declencheAction();

        if (op.equals("-")) operation = Operation.MOINS;
        else if (op.equals("+")) operation = Operation.PLUS;
        else if (op.equals("*") || op.equals("x")) operation = Operation.MULT;
        else if (op.equals("/")) operation = Operation.DIV;
        else {
            System.out.println("Erreur");
            throw new IllegalArgumentException("Opérateur non valide");
        }

        IcommandeRPN iRPNop = new CommandeOperation(m, operation);
        iRPNop.execute();

        IcommandeRPN iRPNreturn = new CommandeReturnOperande(m);
        Stack<Double> s = m.getOperandes();
        System.out.println(s.pop());
    }
}
