import java.util.HashMap;
import java.util.Scanner;

class Practice_1 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    HashMap<Integer, Problem> problems = new HashMap<>();
    setProblems(problems, scanner);
    System.out.print("Choose number of a problem: ");
    int problemNumber = scanner.nextInt();
    if(problems.containsKey(problemNumber)) problems.get(problemNumber).solve();
  }
  private static void setProblems(HashMap<Integer, Problem> problems, Scanner sc) {
    problems.put(1, new Problem_1("Almansur"));
    problems.put(2, new Problem_2(sc));
    problems.put(3, new Problem_3(sc));
    problems.put(4, new Problem_4(sc));
    problems.put(5, new Problem_5(sc));
    problems.put(6, new Problem_6(sc));
  }
}
