
import java.util.HashMap;
import java.util.Scanner;

class Practice {
  public static void main(String[] args) throws Exception {
    HashMap<Integer, Problem> problems = new HashMap<>();
    setProblems(problems);
    Scanner sc = new Scanner(System.in);
    System.out.print("Choose a problem(1, 2 or 3): ");
    int problem = sc.nextInt();
    if(problem > 3 || problem <= 0) {System.out.println("invalid number");}
    else {
      problems.get(problem).solve();
    }
    sc.close();
  }
  public static void setProblems(HashMap<Integer, Problem> problems) throws Exception {
    problems.put(
      1, new Problem1(
        new Student("Almansur", 99590, StudyYear.Second)
      )
    );
    
    problems.put(
      2, new Problem2(
        new StarTriangle(10)
      )
    );
    
    problems.put(
      3, new Problem3(
        new Time(23, 5, 6), new Time(4, 24, 33)
      )
    );
    
    
  }
}
