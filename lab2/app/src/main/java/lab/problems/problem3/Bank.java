package lab.problems.problem3;

import java.util.Vector;

/**
 * Bank
 */
public class Bank {
    private Vector<Account> accounts;

    public Bank() {
        accounts = new Vector<>();
    }

    public void openAccount(Account account) {
        accounts.add(account);
    }

    public void closeAccount(Account account) {
        accounts.remove(account);
    }

    public Account getAccount(int accNumber) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber() == accNumber) {
                return acc;
            }
        }
        return null;
    }

    public void update() {
        for (Account acc : accounts) {
            if (acc instanceof SavingsAccount) {
                ((SavingsAccount) acc).addInterest();
            } else if (acc instanceof CheckingAccount) {
                ((CheckingAccount) acc).deductFee();
                ((CheckingAccount) acc).resetTransactionCount();
            }
        }
    }

    public void displayAllAccounts() {
        System.out.println("=== Bank Accounts ===");
        for (Account acc : accounts) {
            acc.print();
        }
        System.out.println();
    }

    public int getAccountCount() {
        return accounts.size();
    }

    public Vector<Account> getAllAccounts() {
        return new Vector<>(accounts);
    }
}
