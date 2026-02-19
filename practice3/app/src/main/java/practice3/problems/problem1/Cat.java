


package practice3.problems.problem1;

/**
 * Cat
 */
public class Cat extends Animal {
    
    
    
    public Cat(String name, int age, double weight) {
        super(name, age, weight);
    }
    public Cat(int age, double weight) {
        super(age, weight);
    }
    
    @Override
    public void sleep() {
        System.out.printf("Cat %s is sleeping zzZ...%n", this.name);
    }
    @Override
    public void eat() {
        System.out.printf("Cat %s is eating!!%n", this.name);
    }
    public void meow() {
        System.out.println("meow)");
    }
}
