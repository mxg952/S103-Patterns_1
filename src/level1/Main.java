package level1;

public class Main {
    public static void main(String[] args) {
        Undo undo = Undo.getInstance();

        undo.addCommand("sudo apt install vlc");
        undo.addCommand("cd /Descarregues");
        undo.addCommand("cd ..");
        undo.addCommand("sudo apt update");

        System.out.println("\nAra imprimim la llista amb totes les commandes: ");
        undo.listCommands();

        undo.removeLast();

        System.out.println("\nAra imprimim la llista després de elminar l´ultima commanda: ");
        undo.listCommands();
    }
}