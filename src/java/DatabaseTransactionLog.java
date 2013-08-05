public class DatabaseTransactionLog implements TransactionLog {
    @Override
    public void doLogTransaction() {
        System.out.println("DatabaseTransactionLog");
    }
}
