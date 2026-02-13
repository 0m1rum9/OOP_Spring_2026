

package lab.problems.problem5;

import java.util.Vector;

/**
 * DragonLaunch
 */
public class DragonLaunch {

    private Vector<Person> food;
    public DragonLaunch() {
        food = new Vector<>();
    }
    public void kidnap(Person person) {
        if(food.size() == 0) {
            food.add(person);
            return;
        }
        if(food.getLast().getGender() == Gender.Male && person.getGender() == Gender.Female)
            food.removeLast();
        else food.add(person);
    }
    public boolean willDragonEatOrNot() {
        return food.size() != 0;
    }
}
