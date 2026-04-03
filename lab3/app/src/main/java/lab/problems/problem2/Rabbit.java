
package lab.problems.problem2;

/**
 * Rabbit
 */
public class Rabbit implements Damagable {

    private int HP;

    private boolean isDead = false;
    private String position;

    public Rabbit(int HP, String position) {
        this.HP = HP;
        this.position = position;
    } 
    
    @Override
    public void move(String to) {
        // some validation
        if(isDead) {
            System.out.println(getDeadMessage());
            return;
        }
        System.out.printf("moved chair from %s to %s\n", position, to);

        this.position = to;
    }


    @Override
    public void getDamaged(int damage) {
        if(isDead){
            System.out.println(getDeadMessage());
            return;
        }
        if (HP <= damage)
            die();
        else
            HP -= damage;

    }

    private String getDeadMessage() {
        return "Rabbit is dead, there is nothing he can do";
    }

    private void die() {
        isDead = true;
        System.out.println("Rabbit died");
    }
}
