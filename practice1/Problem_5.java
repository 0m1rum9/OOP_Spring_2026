import java.math.BigDecimal;
import java.util.Scanner;

class Problem_5 {
  static class Account {
    private BigDecimal balance;
    Account(BigDecimal initialBalance) {
      this.balance = initialBalance;
    }
    public void addInterest(BigDecimal interest) {
      balance = balance
                .add(balance
                  .multiply(interest.divide(BigDecimal.valueOf(100))));
    }
    public BigDecimal currentBalance() {
      return this.balance;
    }
  }
  public static void solve(Scanner sc) {
    Account acc = new Account(BigDecimal.valueOf(100));
    System.out.println(acc.currentBalance());
    acc.addInterest(BigDecimal.valueOf(5));
    System.out.println(acc.currentBalance());
  }
}
