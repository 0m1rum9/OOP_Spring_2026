import java.util.Scanner;


class Problem_4 {
  static class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    QuadraticEquation(double a, double b, double c) {
      this.a = a;
      this.b = b;
      this.c = c;
    }

    public Pair<Double> solve() throws NegativeDiscriminantException{
      double d = getD();
      double x1 = Double.NaN, x2 = Double.NaN;
      if (d == 0)
        x1 = (-b + Math.sqrt(d)) / (2 * a);
      else if (d > 0) {
        x1 = (-b + Math.sqrt(d)) / (2 * a);
        x2 = (-b - Math.sqrt(d)) / (2 * a);
      }
      else{
        throw new NegativeDiscriminantException("D < 0");
      }
      return new Pair<Double>(x1, x2);
    }

    public double getD() {
      return b * b - 4 * a * c;
    }

    public class NegativeDiscriminantException extends Exception {
    NegativeDiscriminantException(String errorMessage) {
      super(errorMessage);
    }
    }

  }

  static class Pair<T> {
    public T first;
    public T second;

    Pair(T first, T second) {
      this.first = first;
      this.second = second;
    }
  }

  public static void solve(Scanner sc) {
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double c = sc.nextDouble();
    QuadraticEquation eq = new QuadraticEquation(a, b, c);
    try{
      Pair<Double> roots = eq.solve();
      if(roots.second.equals(Double.NaN)){
        System.out.printf("x1: %f\n", roots.first);
      }
      else {
        System.out.printf("x1: %f\nx2: %f\n", roots.first, roots.second);
      }
    } catch(QuadraticEquation.NegativeDiscriminantException e){
      System.out.println(e.getMessage());
    }
  }
}
