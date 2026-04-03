

package lab.problems.problem4;

public abstract class Person {
    protected String name;
    protected int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    
    
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    
    
    
    @Override
    public String toString() {
        return name + " (" + ", age " + age + ") - ";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Person)) return false;
        Person other = (Person) obj;
        return this.name.equals(other.name) && this.age == other.age;
    }
    
    @Override
    public int hashCode() {
        return name.hashCode() * 31 + age;
    }
}
