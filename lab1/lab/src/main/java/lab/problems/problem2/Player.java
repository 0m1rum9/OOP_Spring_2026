
package lab.problems.problem2;

/**
 * Player
 */
public class Player {
    public final Color color;
    public final String name;
    private static Integer id = 1;
    public Player(Color color) {
        this(
            color,
            String.format("player %d", id++)
        );
    }
    public Player(Color color, String name) {
        this.color = color;
        this.name = name;
    }
    public void move(Position from, Position to, Board board) {
        // some validation...
        board.move(from, to);
    }
    public void resign() {}
}
