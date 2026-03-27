
package practice4.problems.problem;


/**
 * Student
 */
public class Student extends Person implements CanHavePizza  {
    private String faculty;


    public Student(String name, int age, double money, boolean isHungry, String faculty) {
        super(age, name, money, isHungry);
        this.faculty = faculty;
    }

    @Override
    public boolean eatPizza(Pizza pizza) {
        if (isHungry) {
            System.out.println("I was waiting for this pizza for 3 thou...no 4 thousand years");
            isHungry = false;
            return true;
        } else {
            System.out.println("Can't eat pizza");
            return false;
        }
    }
}
