
package practice4.problems.problem;

/**
 * Person
 */
public class Person {

    protected int age;
    protected String name;
    protected boolean isHungry;
    protected double money;

    public Person(int age, String name, double money, boolean isHungry) {
        this.age = age;
        this.name = name;
        this.money = money;
        this.isHungry = isHungry;
    }

    public Person(int age, String name) {
        this(age, name, 0, false);
    }
    public Person(int age, String name, double money) {
        this(age, name, money, false);
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void becomeHungry() {
        this.isHungry = true;
    }
    

    public boolean Pay(double money) {
        if (this.money < money)
            return false;
        this.money -= money;
        return true;
    }
}
