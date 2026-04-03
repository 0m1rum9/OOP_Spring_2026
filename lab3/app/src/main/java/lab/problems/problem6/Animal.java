package lab.problems.problem6;

import lab.problems.problem5.Feedable;

public abstract class Animal implements Comparable<Animal>, Feedable{
    protected String name;
    protected int age;

    protected boolean hungry;
    
    public Animal(String name, int age, boolean hungry) {
        this.name = name;
        this.age = age;
        this.hungry = hungry;
    }
    
    public abstract String getSound();
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    @Override
    public String toString() {
        return getClass().getSimpleName() + " named " + name + " (age " + age + ")";
    }
    @Override
    public int compareTo(Animal arg0) {
        return Integer.compare(age, arg0.age);
    }
    @Override
    public void feed() {
        if(isHungry()){
            System.out.println("delicious");
        } else {
            System.out.println("not hungry");
        }
    }
    @Override
    public boolean isHungry() {
        return hungry;
    }
}
