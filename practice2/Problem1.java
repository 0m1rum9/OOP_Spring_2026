

/**
 * Problem1
 */
public class Problem1 implements Problem {
  private Student student;

  Problem1(Student student) {
    this.student = student;
  }
  public void solve() {
    System.out.println(student);
  }
}
