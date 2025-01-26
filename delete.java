package tp3;

public class delete extends transaction {

    private String clientId;

    // Constructeur pour Initialiser l'ID du client
    public delete(String transactionID, String clientID) {
        super(transactionID, clientID);
    }

    // Implémentation de la méthode execute()

    public void execute() {
        System.out.println("Suppression du client avec ID: " +clientID);
    }
}
