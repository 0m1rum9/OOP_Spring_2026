

package practice3.problems.problem1;

/**
 * Animal
 */
public abstract class Animal {

    protected String name;
    protected int age;
    protected double weight;

    public Animal() {}

    public Animal(int age, double weight) {
        this(null, age, weight);
    }
    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return this.age;
    }
    public double getWeight() {
        return this.weight;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public abstract void eat();
    public abstract void sleep();
    
}


 
