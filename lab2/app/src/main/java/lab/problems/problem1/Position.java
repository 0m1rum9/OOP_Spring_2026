package lab.problems.problem1;

/**
 * Position
 */
public class Position {

    private double x, y, z;

    public Position(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }
    public double getZ() {
        return z;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj.getClass() != this.getClass())
            return false;
        Position p = (Position)obj;
        return p.x == x
            && p.y == y
            && p.z == z;
    }
    @Override
    public int hashCode() {
        return Double.hashCode(x) + Double.hashCode(y) + Double.hashCode(z);
    }
    
}
