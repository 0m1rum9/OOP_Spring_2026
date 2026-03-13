
package lab.problems.problem1;

/**
 * Villager
 */
public class Villager extends Entity {
  private String occupation;

  public Villager(Position position, int healthPoints) {
    super(position, healthPoints);
    this.occupation = "";
  }
  public Villager(Position position, int healthPoints, String occupation) {
    this(position, healthPoints);
    this.occupation = occupation;
  }
  
  public void move(Position position) {
    this.position = position;
  }
  public void getPunched(int damage) {
    healthPoints -= damage;
    if(healthPoints <= 0)
      this.die();
  }
  @Override
  public void die() {
    System.out.println("Villager died");
  }
  @Override
  public int hashCode() {
    return occupation.hashCode() * super.hashCode();
  }
  @Override
  public boolean equals(Object obj) {
    if(!super.equals(obj))
      return false;
    if(obj.getClass() != this.getClass())
      return false;
    Villager v = (Villager)obj;
    return v.occupation.equals(occupation);
  }
  
}
