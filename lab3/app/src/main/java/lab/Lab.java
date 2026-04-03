package lab;

import lab.problems.Problem;

/**
 * Lab
 */
public class Lab {

    public void run() {
        lab.problems.problem5.Problem p = new lab.problems.problem5.Problem();
        p.solve();
    }

    public static void main(String[] args) {
        new Lab().run();
    }
}
