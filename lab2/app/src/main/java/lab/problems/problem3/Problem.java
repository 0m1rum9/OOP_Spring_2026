package lab.problems.problem3;

/**
 * Problem
 */
public class Problem implements lab.problems.Problem {

    @Override
    public void solve() {

        Bank bank = new Bank();

        SavingsAccount savings1 = new SavingsAccount(1001, 3.5);
        SavingsAccount savings2 = new SavingsAccount(1002, 2.5);
        CheckingAccount checking1 = new CheckingAccount(2001);
        CheckingAccount checking2 = new CheckingAccount(2002);

        bank.openAccount(savings1);
        bank.openAccount(savings2);
        bank.openAccount(checking1);
        bank.openAccount(checking2);

        bank.displayAllAccounts();

        savings1.deposit(1000);
        savings2.deposit(500);
        System.out.println("After deposits:");
        bank.displayAllAccounts();

        savings1.addInterest();
        savings2.addInterest();
        System.out.println("After adding interest:");
        bank.displayAllAccounts();

        checking1.deposit(2000);
        checking1.print();

        for (int i = 0; i < 12; i++) {
            checking1.withdraw(10);
        }
        System.out.println("Transaction count: " + checking1.getTransactionCount());
        checking1.print();

        checking1.deductFee();
        System.out.println("After fee deduction:");
        checking1.print();
        checking1.resetTransactionCount();

        savings1.transfer(100, checking2);
        System.out.println("Savings1 after transfer:");
        savings1.print();
        checking2.print();

        bank.update();
        bank.displayAllAccounts();

        bank.closeAccount(checking2);
        bank.displayAllAccounts();
    }
}
