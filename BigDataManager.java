package tp3;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

    public class BigDataManager {
        private List<transaction> transactions;
        private int failedTransactions;
        private int successfulTransactions;

        public BigDataManager() {
            transactions = new ArrayList<>();
            successfulTransactions = 0;
            failedTransactions = 0;
        }

        public void addTransaction(transaction t) {
            transactions.add(t);
        }

        public void processAllTransactions() {
            Random random = new Random();

            for (transaction t : transactions) {
                if (random.nextBoolean()) {
                    TransactionProcessor.processTransaction(t);
                    successfulTransactions++;
                } else {
                    System.out.println("Échec de la transaction.");
                    failedTransactions++;
                }
            }

            System.out.println("Transactions réussies : " + successfulTransactions);
            System.out.println("Transactions échouées : " + failedTransactions);
        }
    }


