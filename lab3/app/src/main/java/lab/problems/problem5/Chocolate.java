

package lab.problems.problem5;

/**
 * Chocolate
 */
public class Chocolate implements Comparable<Chocolate> {

    public double weight;
    public String name;

    public Chocolate() {
        
    }
    public Chocolate(double weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    @Override
    public int compareTo(Chocolate arg0) {
        return Double.compare(weight, arg0.weight);
    }


    @Override
    public String toString() {
        return String.format(
            "Chocolate: %s, Weight: %.2f",
            name, weight
        );
    }
 }
