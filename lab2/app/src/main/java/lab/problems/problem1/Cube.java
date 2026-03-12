package lab.problems.problem1;

/**
 * Cube
 */
public class Cube extends Shape3D {

    private double length;

    public Cube(double length) {
        this.length = length;
    }
    public double volume() {
        return Math.pow(length, 3);
    }
    public double surfaceArea() {
        return 6 * Math.pow(length, 2);
    }
}
