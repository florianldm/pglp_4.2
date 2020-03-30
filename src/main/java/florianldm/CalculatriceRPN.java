package florianldm;
import java.util.Scanner;
import java.util.Stack;

final class CalculatriceRPN {
    /**
     * Programme principal.
     */
    private CalculatriceRPN() {

    }

    /**
     * Main.
     */
    static void main() {
        double nombre;
        String op = "";
        Operation operation = Operation.PLUS;
        SaisieRPN s = new SaisieRPN();
        MoteurRPN m = new MoteurRPN();
        Interpreteur i = new Interpreteur();

        System.out.println("Exemple d'une opération simple !");
        System.out.println("Entrer 1 pour lancer / quit pour quitter");
        String rep;
        Scanner scan = new Scanner(System.in, "UTF-8");
        rep = scan.nextLine();
        if (rep.equals("quit")) {
            Icommande quit = new CommandeExit(i);
            quit.execute();
        }

        System.out.println("Saisir un nombre");
        nombre = s.getScanner().nextDouble();
        IcommandeRPN iRPN = new CommandeSaveOperande(m, nombre);

        //Sauvegarde de l'opérande.
        s.i = iRPN;
        s.i.execute();

        while (!op.equals("quit")) {
            System.out.println("Saisir le type d'operation");
            op = s.getScanner2().nextLine();

            if (!op.equals("quit")) {
                System.out.println("Saisir le deuxieme nombre");
                nombre = s.getScanner().nextDouble();
                IcommandeRPN iRPN2 = new CommandeSaveOperande(m, nombre);

                s.i = iRPN2;
                s.i.execute();

                switch (op) {
                    case "-":
                        operation = Operation.MOINS;
                        break;
                    case "+":
                        operation = Operation.PLUS;
                        break;
                    case "*":
                    case "x":
                        operation = Operation.MULT;
                        break;
                    case "/":
                        operation = Operation.DIV;
                        break;
                    default:
                        System.out.println("Erreur");
                        throw new IllegalArgumentException("Opé non valide");
                }

                IcommandeRPN iRPNop = new CommandeOperation(m, operation);
                iRPNop.execute();

                //IcommandeRPN iRPNreturn = new CommandeReturnOperande(m);
                Stack<Double> s1 = m.getOperandes();
                System.out.println("Résultat: " + s1.toString());
            }
        }


    }
}
