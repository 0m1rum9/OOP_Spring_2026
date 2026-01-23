import java.util.Scanner;

class Problem_3 implements Problem {
  static class GradeConverter {
    public String convert(int grade) throws InvalidGradeException {
      if(grade >= 95 && grade <= 100)
        return "A";
      else if(grade >= 90 && grade < 95)
        return "A-";
      else if(grade >= 85 && grade < 90)
        return "B+";
      else if(grade >= 80 && grade < 85)
        return "B";
      else if(grade >= 75 && grade < 80)
        return "B-";
      else if(grade >= 70 && grade < 75)
        return "C+";
      else if(grade >= 65 && grade < 70)
        return "C";
      else if(grade >= 60 && grade < 65)
        return "C-";
      else if(grade >= 55 && grade < 60)
        return "D+";
      else if(grade >= 50 && grade < 55)
        return "D";
      else if(grade < 50 && grade >= 0)
        return "F";
      else
        throw new InvalidGradeException("Invalid grade: " + grade);
    }


    
      public class InvalidGradeException extends Exception {
        InvalidGradeException(String errorMessage) {
          super(errorMessage);
        }
      }

  }
  private Scanner sc;
  Problem_3(Scanner scanner) {
    this.sc = scanner;
  }
  public void solve() {
    int grade = sc.nextInt();
    GradeConverter converter = new GradeConverter();
    try{
      System.out.println(converter.convert(grade));
    }
    catch (GradeConverter.InvalidGradeException e){
      System.out.println(e.getMessage());
    }
  }
}

