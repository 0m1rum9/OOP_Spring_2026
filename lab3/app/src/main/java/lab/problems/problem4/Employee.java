

package lab.problems.problem4;

import java.util.Date;

/**
 * Employee
 */
public class Employee extends Person implements Comparable<Employee> {

    protected double salary;
    protected Date hireDate;
    protected String insuranceNumber;

    public Employee(String name, int age, double salary, Date hireDate, String insuranceNumber) {
        super(name, age);
        this.salary = salary;
        this.hireDate = hireDate;
        this.insuranceNumber = insuranceNumber;
    }


    @Override
    public String toString() {
        return String.format(
            "Name: %s, age: %d, hire date: %s, salary %.2f, insurance number: %s",
            name, age, hireDate.toString(), salary, insuranceNumber
        );
    }

    @Override
    public boolean equals(Object obj) {
        if(! super.equals(obj)) return false;

        if(!(obj instanceof Employee)) return false;

        Employee employee = (Employee)obj;

        return employee.salary == salary
            && employee.hireDate.equals(hireDate)
            && employee.insuranceNumber.equals(insuranceNumber);

    }
    @Override
    public int compareTo(Employee e) {
        return Double.compare(salary, e.salary);
    }

    @Override
    protected Employee clone() throws CloneNotSupportedException {
        try {
            Employee copy = (Employee) super.clone(); 
            copy.hireDate = new Date(this.hireDate.getTime());
            return copy;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public Date getHireDate() {
        return hireDate;
    }
    public double getSalary() {
        return salary;
    }
}
