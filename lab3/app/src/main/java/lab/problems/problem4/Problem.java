
package lab.problems.problem4;

import java.util.Collections;
import java.util.Date;
import java.util.Vector;

/**
 * Problem
 */
public class Problem implements lab.problems.Problem {

    @Override
    public void solve() {
        Employee bobby = new Employee("bobby", 34, 123.4, new Date(), "123");
        Employee rick = new Employee("Rick", 25, 1000, new Date(), "333");
        Vector<Employee> team = new Vector<>();
        team.add(bobby);
        team.add(rick);
        Manager dexter = new Manager("dexter", 44, 4000, new Date(), "43535", team, 10000);
        Manager giannis = new Manager("giannis", 41, 4000, new Date(), "43535", team, 5600);
        Vector<Employee> v = new Vector<>();
        v.add(rick);
        v.add(bobby);
        v.add(dexter);
        v.add(giannis);
        System.out.println("=== by salary or bonus ===");
        Collections.sort(v);
        for (Employee em : v) {
            System.out.println(em.getName() + " - " + em.getSalary());
        }
        
        System.out.println("=== by name ===");
        Collections.sort(v, new NameComparator());

        for (Employee em : v) {
            System.out.println(em.getName() + " - " + em.getSalary());
        }

        System.out.println("=== by date === ");
        Collections.sort(v, new HireDateComparator());
        for (Employee em : v) {
            System.out.println(em.getName() + " - " + em.getSalary());
        }

    }
}
