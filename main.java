package tp3;
import java.util.ArrayList;
import java.util.List;


    public class main {
        public static void main(String[] args) {
            List<transaction> transactions = new ArrayList<>();
            transactions.add(new insert("1", "1"));
            transactions.add(new update("2", "2"));
            transactions.add(new delete("3", "3"));
            for (transaction t : transactions) {
                t.showDetails();
                TransactionProcessor.processTransaction(t);
            }
        }
    }





