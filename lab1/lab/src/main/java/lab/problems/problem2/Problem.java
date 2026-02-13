

package lab.problems.problem2;

import java.util.Scanner;

/**
 * Problem
 */
public class Problem implements lab.problems.Problem{
    private Scanner scanner;
    public Problem(Scanner scanner) {
        this.scanner = scanner;
    }
    public void solve() {
        Game game = new Game(scanner);
        game.start();
    }
}
