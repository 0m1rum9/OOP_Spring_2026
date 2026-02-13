

package lab.problems.problem4;

/**
 * InvalidGradeException
 */
public class InvalidGradeException extends Exception {
    
    public InvalidGradeException() {
        super("grade must be <= 100 and >= 0");
    }
    
}
