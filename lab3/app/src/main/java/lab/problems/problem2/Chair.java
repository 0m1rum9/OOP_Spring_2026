

package lab.problems.problem2;

/**
 * Chair
 */
public class Chair implements Movable {

    private String position;
    public Chair(String position) {
        this.position = position;
    }

    @Override
    public void move(String to) {
        System.out.printf("moved chair from %s to %s\n", position, to);
        this.position = to;
    }
}
