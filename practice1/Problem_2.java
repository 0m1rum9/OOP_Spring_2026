import java.util.Scanner;

class Problem_2 implements Problem {
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
  private Scanner sc;
  Problem_2(Scanner scanner) {
    this.sc = scanner;
  }
  public void solve() {
    double a = sc.nextDouble();
    Square sq = new Square(a);
    System.out.printf("Area: %f\nPerimeter: %f\nDiagonal: %f\n",
      sq.calculateArea(),
      sq.calculatePerimeter(),
      sq.calculateDiagonal()
    );
  }
}
