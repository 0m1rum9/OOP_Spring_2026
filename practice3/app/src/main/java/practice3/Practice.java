


package practice3;

import java.util.HashMap;
import java.util.Scanner;

import practice3.problems.Problem;
/**
 * Practice
 */
public class Practice {

    private void run() {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Problem> problemset = new HashMap<>();
        setProblems(problemset, sc);
        System.out.print("Enter number of a problem(1 or 2): ");
        int problem = sc.nextInt();
        sc.nextLine();
        problemset.get(problem).solve();
        sc.close();
        
    }
    private void setProblems(HashMap<Integer, Problem> problemset, Scanner scanner) {
        problemset.put(1, new practice3.problems.problem1.Problem());
        problemset.put(2, new practice3.problems.problem2.Problem(scanner));
    }
    

    public static void main(String[] args) {
        new Practice().run();
    }
}
