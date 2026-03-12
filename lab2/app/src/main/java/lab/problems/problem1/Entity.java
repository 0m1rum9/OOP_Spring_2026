package lab.problems.problem1;

/**
 * Entity
 */
public abstract class Entity {

    private Position position;
    private int healthPoints;
    
    public Entity(Position position, int healthPoints) {
        this.position = position;
        this.healthPoints = healthPoints;
    }
    
    public abstract void move(Position position);

    

    public abstract void getPunched();
    
    
}
