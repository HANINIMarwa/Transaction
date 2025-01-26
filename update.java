package tp3;

public class update extends transaction {

    private String clientID;

    // Constructeur pour Initialiser l'ID du client
    public update(String transactionID,String clientID) {
        super( transactionID,clientID);
    }

    // Implémentation de la méthode execute()

    public void execute() {
        System.out.println("Mise à jour des informations du client avec ID: " +clientID);
    }
}
