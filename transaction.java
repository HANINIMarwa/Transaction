package tp3;

public abstract class transaction {

    // les attributs
    protected String transactionID;
    protected String clientID;

    // Constructeur
    public transaction(String transactionID,String clientID ) {
        this.transactionID=transactionID;
        this.clientID= clientID;
    }

    public abstract void execute();
    public void showDetails(){
        System.out.println(" Transaction ID: \"+transactionID +\" | Client ID: \" +clientID");
    }
}
