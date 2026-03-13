package lab.problems.problem3;

/**
 * SavingsAccount
 */
public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(int accNumber, double interestRate) {
        super(accNumber);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = getBalance() * (interestRate / 100.0);
        deposit(interest);
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double rate) {
        this.interestRate = rate;
    }

    @Override
    public String toString() {
        return String.format("SavingsAccount %d: $%.2f (Interest Rate: %.2f%%)",
                getAccountNumber(), getBalance(), interestRate);
    }
}
