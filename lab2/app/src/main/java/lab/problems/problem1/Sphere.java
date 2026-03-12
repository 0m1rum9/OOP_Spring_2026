
package lab.problems.problem1;

/**
 * Sphere
 */
public class Sphere extends Shape3D {

    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }
    public double volume() {
        return (4.0/3.0) * Math.PI * Math.pow(radius, 3);
        // 4/3 pr^3
    }
    public double surfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
        // 4pr^2
    }
}
