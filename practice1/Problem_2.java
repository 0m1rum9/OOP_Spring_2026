import java.util.Scanner;

class Problem_2 {
  static class Square {
    private double length;
    Square(double length) {
      this.length = length;
    }
    public double calculateArea() {
      return this.length * this.length;
    }
    public double calculatePerimeter() {
      return this.length * 4;
    }
    public double calculateDiagonal() {
      return this.length * Math.sqrt(2);
    }
  }
  public static void solve(Scanner sc) {
    double a = sc.nextDouble();
    Square sq = new Square(a);
    System.out.printf("Area: %f\nPerimeter: %f\nDiagonal: %f\n",
      sq.calculateArea(),
      sq.calculatePerimeter(),
      sq.calculateDiagonal()
    );
  }
}
