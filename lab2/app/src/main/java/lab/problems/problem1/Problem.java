
package lab.problems.problem1;

import java.util.HashSet;

/**
 * Problem
 */
public class Problem implements lab.problems.Problem {

    public void solve() {
        partC();
        
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

    public void partC() {
        HashSet<Entity> h = new HashSet<>();
        Entity e1 = new Villager(new Position(10, 10, 3), 100);
        Entity e2 = new Villager(new Position(10, 10, 3), 100);
        h.add(e1);
        h.add(e2);
        System.out.println(h.size());
        
    }
    
}
