package lab.problems.problem1;

/**
 * Entity
 */
public abstract class Entity {

    protected Position position;
    protected int healthPoints;
    
    
    public Entity(Position position, int healthPoints) {
        this.position = position;
        this.healthPoints = healthPoints;
    }
    
    public abstract void move(Position position);

    public abstract void getPunched(int damage);
    

    @Override
    public int hashCode() {
        return position.hashCode() * healthPoints;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj.getClass() != this.getClass()) {
            return false;
        }
        Entity e = (Entity)obj;

        return e.position.equals(position)
            && e.healthPoints == healthPoints;
    }
    public abstract void die();
}
