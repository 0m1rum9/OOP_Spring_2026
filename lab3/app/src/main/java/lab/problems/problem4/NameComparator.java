
package lab.problems.problem4;

import java.util.Comparator;

/**
 * NameComparator
 */
public class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee a, Employee b) {
        return a.getName().compareTo(b.getName());
    }
}
