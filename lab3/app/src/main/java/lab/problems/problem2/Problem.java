


package lab.problems.problem2;

/**
 * Problem
 */
public class Problem implements lab.problems.Problem {

    public void solve() {
        Rabbit r = new Rabbit(100, "forest");
        r.move("town");
        r.getDamaged(101);
        r.move("forest");
        Chair c = new Chair("Room 1");
        c.move("Room 2");
        
    }
}
