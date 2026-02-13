
package lab.problems.problem3;

/**
 * Problem
 */
public class Problem  implements lab.problems.Problem {
    
    public Problem() {    }
    
    public void solve() {
        Temperature temperature = new Temperature(12.5, Scale.Celcius);
        System.out.println(temperature.getCelcius());
        System.out.println(temperature.getFahrenheit());
    }
    
}
