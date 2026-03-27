

package practice4.problems.problem;

/**
 * Cat
 */
public class Cat implements CanHavePizza {

    private boolean isHungry;
    private String breed;
    private int age;

    public Cat(int age, String breed, boolean isHungry) {
        this.breed = breed;
        this.age = age;
        this.isHungry = isHungry;
    }
    public Cat(int age, String breed) {
        this(age, breed, false);
    }
    public Cat(int age) {
        this(age, "кот обыкновенный:D", false);
    }

    public String getBreed() {
        return breed;
    }
    public int getAge() {
        return age;
    }
    public void happyBirthday() {
        this.age++;
    }
    public void becomeHungry() {
        isHungry = true;
    }
    @Override
    public boolean eatPizza(Pizza pizza) {
        if(isHungry) {
            System.out.println("Meow~licious pizza mrr~");
            isHungry = false;
            return true;
        } else {
            System.out.println("Meown't hungry yet");
            return false;
        }
    }

    
}
