

package lab.problems.problem5;

/**
 * Problem
 */
public class Problem implements lab.problems.Problem {

    @Override
    public void solve() {
        Chocolate c1 = new Chocolate(123.3, "fre");
        Chocolate c2 = new Chocolate(123, "fre");
        Chocolate[] chocolates = {c1, c2, new Chocolate(10, "fas")};
        Sort.selectionSort(chocolates, 3);
        for(int i = 0; i < 3; i++) {
            System.out.println(chocolates[i].weight);
        }
    }
}
