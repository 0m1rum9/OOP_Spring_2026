

class Student {
  private String name;
  private int id;
  private StudyYear studyYear;
  Student(String name, int id, StudyYear studyYear) {
    this.name = name;
    this.id = id;
    this.studyYear = studyYear;
  }
  public String getName() {
    return this.name;
  }
  public int getID() {
    return this.id;
  }
  public StudyYear getYear() {
    return this.studyYear;
  }
  public void incrementStudyYear() throws Exception {
    this.studyYear.increment();
  }
  @Override
  public String toString() {
    return String.format("Name: %s\nID:%d\nYear of study: %d\n", getName(), getID(), getYear().getInt());
  }
}
