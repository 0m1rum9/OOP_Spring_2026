package lab.problems.problem1;
import java.util.Scanner;
public class Analyzer  {
  private Data data;
  private Scanner scanner;
  public Analyzer(Scanner scanner, Data data) {
    this.data = data;
    this.scanner = scanner;
  }
  public void process() {
    String input = "";
    while(!input.equals("Q")) {
      System.out.print("Enter number(Q to quit): ");
      input = scanner.nextLine();
      if(input.trim().equals("Q")) break;
      
      try {
        data.addData(Double.parseDouble(input));
      } catch(NumberFormatException e) {
        System.out.println("Incorrect value");
      }
    }
    System.out.printf("Average: %f\nMaximum: %f\n", data.getAverage(), data.getLargest());
  }
  
  
}
