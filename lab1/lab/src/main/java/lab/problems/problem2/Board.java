

package lab.problems.problem2;

import java.util.HashMap;

/**
 * Board
 */
public class Board {
    private HashMap<Position, Piece> table;
    public Board() {}
    public Board(HashMap<Position, Piece> table) {
        this.table = table;
    }
    public void move(Position from, Position to) {
        // some validation
        table.get(from).move(to);
    }
    public String getBoard() {
        return "";
    }
}
