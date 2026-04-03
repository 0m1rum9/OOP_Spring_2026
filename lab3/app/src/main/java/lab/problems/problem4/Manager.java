
package lab.problems.problem4;

import java.util.Date;
import java.util.Vector;

/**
 * Manager
 */
public class Manager extends Employee {

    private Vector<Employee> team;
    private double bonus;

    public Manager(String name, int age, double salary, Date hireDate, String insuranceNumber,
            Vector<Employee> team, double bonus) {
        super(name, age, salary, hireDate, insuranceNumber);
        this.team = team;
        this.bonus = bonus;
    }

    @Override
    public int compareTo(Employee other) {
        int result = super.compareTo(other);

        if (result == 0 && other instanceof Manager m) {
            return Double.compare(this.bonus, m.bonus);
        }

        return result;
    }

    @Override
    public Manager clone() {
        try {
            Manager copy = (Manager) super.clone();

            Vector<Employee> teamCopy = new Vector<>();
            for (Employee e : this.team) {
                teamCopy.add(e.clone());
            }
            copy.team = teamCopy;

            return copy;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

}
