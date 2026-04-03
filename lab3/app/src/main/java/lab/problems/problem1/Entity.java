
package lab.problems.problem1;

/**
 * Entity
 */
public abstract class Entity {

    protected int HP;
    protected String position;

    public void getPunched(int damage) {
        if (HP <= damage)
            die();
        else
            HP -= damage;
    }

    protected void die() {
        doDeathAnimation();
        sendToHeaven();
    }

    protected abstract void sendToHeaven();

    protected abstract void doDeathAnimation();
}
