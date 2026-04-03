package lab.problems.problem6;

import lab.problems.problem5.Trainable;

public class Fish extends Animal implements Trainable {
    private int levelOfTraining;
    public Fish(String name, int age, boolean hungry) {
        super(name, age, hungry);
    }
    
    @Override
    public String getSound() {
        return "Blub";
    }
        
    @Override
    public void train() {
        this.levelOfTraining++;
    }
}
