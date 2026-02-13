
package lab.problems.problem5;

/**
 * Problem
 */
public class Problem implements lab.problems.Problem {
    
    public void solve() {
        DragonLaunch d = new DragonLaunch();
        d.kidnap(new Person(Gender.Female, "al"));
        d.kidnap(new Person(Gender.Male, "al"));
        d.kidnap(new Person(Gender.Female, "a"));
        d.kidnap(new Person(Gender.Male, "a"));
        System.out.println(d.willDragonEatOrNot());
    }
    
}
