package tp3;

public class insert extends transaction {

    private String clientID;

    // Constructeur pour Initialiser l'ID du client
    public insert(String transactionID,String clientID) {

        super(transactionID, clientID);
    }

    // Implémentation de la méthode execute()

    public void execute() {
        System.out.println("Insertion d'un nouveau client avec ID: " +clientID);
    }
}
