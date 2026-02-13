package lab.problems.problem1;
public class Data {
  private double sum;
  private long count;
  private double max;
  public Data() {}
  public void addData(double value) {
    if(max < value) max = value;
    this.sum += value;
    count++;
  }
  public double getAverage() {
    if(count == 0) return 0.0;
    return sum / count;
  }
  public double getLargest() {
    return max;
  }
}
