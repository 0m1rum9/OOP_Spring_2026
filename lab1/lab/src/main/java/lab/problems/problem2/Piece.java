

package lab.problems.problem2;

public abstract class Piece {
    
    public final Color color;
    protected Position position;
    public Piece(Position position, Color color) {
        this.color = color;
        this.position = position;
    }
    public Piece() {
        this.color = null;
    }
    public abstract int getValue();
    public abstract void move(Position to);
}
