package lab;

import java.util.HashMap;
import java.util.Scanner;

import lab.problems.Problem;

class Lab {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, Problem> problemset = new HashMap<>();
        setProblemset(problemset, scanner);
        System.out.print("Enter number of a problem: ");
        int problem = scanner.nextInt();
        scanner.nextLine();
        problemset.get(problem).solve();
    }
    public static void setProblemset(HashMap<Integer, Problem> problemset, Scanner scanner) {
        
        problemset.put(1, new lab.problems.problem1.Problem(scanner));
        problemset.put(2, new lab.problems.problem2.Problem(scanner));
        problemset.put(3, new lab.problems.problem3.Problem());
        problemset.put(4, new lab.problems.problem4.Problem(scanner));
        problemset.put(5, new lab.problems.problem5.Problem());
        
    }
}
