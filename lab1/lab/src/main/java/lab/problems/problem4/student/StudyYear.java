package lab.problems.problem4.student;

public enum StudyYear {
  First(1),
  Second(2),
  Third(3),
  Fourth(4);
  
  private int year;
  
  StudyYear(int year) {
    this.year = year;
  }
  public int getInt() {
    return this.year;
  }
  public void increment() throws InvalidYearOfStudyException {
    if(year == 4) {
      throw new InvalidYearOfStudyException("year can't be > 4");
    }
    this.year++;
  }
  public class InvalidYearOfStudyException extends Exception {
    InvalidYearOfStudyException(String msg) {
      super(msg);
    }
  }
}
