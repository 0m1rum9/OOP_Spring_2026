

package practice4.problems.problem;

/**
 * Problem
 */
public class Problem implements practice4.problems.Problem {

    @Override
    public void solve() {
        Restaurant r = new Restaurant();
        CanHavePizza client = new Student("jacob", 20, 0.4, true, "CS");
        r.servePizza(client, new Pizza(10, 45.4));
        
    }
}
