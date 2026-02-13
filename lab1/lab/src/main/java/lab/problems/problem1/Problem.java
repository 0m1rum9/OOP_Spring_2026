package lab.problems.problem1;

import java.util.Scanner;

public class Problem implements lab.problems.Problem {
    private Scanner scanner;
    public Problem(Scanner scanner) {
        this.scanner = scanner;
    }
    public void solve(){
        Data data = new Data();
        Analyzer analyzer = new Analyzer(scanner, data);
        analyzer.process();
    }
}
