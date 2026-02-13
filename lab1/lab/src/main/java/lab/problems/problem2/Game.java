

package lab.problems.problem2;

import java.util.Scanner;

/**
 * Game
 */
public class Game {
    Scanner scanner;
    public Game(Scanner scanner) {
        this.scanner = scanner;
    }
    public void start() {
        Board board = new Board();
        System.out.println(startMessage());
        System.out.print(askName(Color.BLACK));
        Player player1 = new Player(Color.BLACK, scanner.nextLine());
        System.out.print(askName(Color.WHITE));
        Player player2 = new Player(Color.WHITE, scanner.nextLine());
        
    }
    private String askName(Color color) {
        String colorStr = ((color == Color.BLACK) ? "black" : "white");
        return String.format("Enter name for the player of %s: ", colorStr);
    }
    private String startMessage() {
        return "Hi there! This is a game of chess";
    }
    
}
