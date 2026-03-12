
package lab.problems.problem1;

/**
 * Problem
 */
public class Problem implements lab.problems.Problem {

    public void solve() {
        partB();
        
    }

    public void partA() {
        Shape3D a = new Cube(10);
        Shape3D b = new Cylinder(5, 3);
        Shape3D c = new Sphere(5);
        System.out.printf("Volume:\n\tcube --> %f\n\tcylinder --> %f\n\tsphere --> %f\n",
                                    a.volume(), b.volume(), c.volume());
        System.out.printf("Surface Area:\n\tcube --> %f\n\tcylinder --> %f\n\tsphere --> %f\n",
                                        a.surfaceArea(), b.surfaceArea(), c.surfaceArea());
    }
    public void partB() {
        LibraryItem book = new Book("pamparam", "robert", 2001, 123, new Knowledge());
        System.out.println(book);
    }
}
