package lab.problems.problem3;

/**
 * Account
 */
public class Account {
    private double balance;
    private int accNumber;

    public Account(int a) {
        balance = 0.0;
        accNumber = a;
    }

    public void deposit(double sum) {
        balance += sum;
    }

    public void withdraw(double sum) {
        if (sum <= balance) {
            balance -= sum;
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accNumber;
    }

    public void transfer(double amount, Account other) {
        if (amount <= balance) {
            this.withdraw(amount);
            other.deposit(amount);
        }
    }

    @Override
    public String toString() {
        return String.format("Account %d: $%.2f", accNumber, balance);
    }

    public final void print() {
        System.out.println(toString());
    }
}
