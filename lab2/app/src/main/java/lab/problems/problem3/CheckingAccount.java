package lab.problems.problem3;

/**
 * CheckingAccount 
 */
public class CheckingAccount extends Account {
    private static final double TRANSACTION_FEE = 0.02;
    private static final int FREE_TRANSACTIONS = 10;
    private int transactionCount;

    public CheckingAccount(int accNumber) {
        super(accNumber);
        this.transactionCount = 0;
    }

    @Override
    public void deposit(double sum) {
        super.deposit(sum);
        transactionCount++;
    }

    @Override
    public void withdraw(double sum) {
        super.withdraw(sum);
        transactionCount++;
    }

    public void deductFee() {
        if (transactionCount > FREE_TRANSACTIONS) {
            int excessTransactions = transactionCount - FREE_TRANSACTIONS;
            double fee = excessTransactions * TRANSACTION_FEE;
            if (fee <= getBalance()) {
                super.withdraw(fee);
            }
        }
    }

    public int getTransactionCount() {
        return transactionCount;
    }

    public void resetTransactionCount() {
        transactionCount = 0;
    }

    @Override
    public String toString() {
        return String.format("CheckingAccount %d: $%.2f (Transactions: %d, Free: %d)",
                getAccountNumber(), getBalance(), transactionCount, FREE_TRANSACTIONS);
    }
}
