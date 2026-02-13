

package lab.problems.problem4;

import java.util.HashMap;
import java.util.List;

import lab.problems.problem4.student.Student;
/**
 * GradeBook
 */
public class GradeBook {

    private Course course;
    private HashMap<Student, Integer> grades;
    public GradeBook(
        Course course,
        List<Student> students 
    ) {
        this.course = course;
        grades = new HashMap<>();
        for(Student student : students) {
            this.grades.put(student, null);
        }
    } // there is no need for multiple constructors since if an instance of GradeBook can have no course and no students, then isn't it an UB?
    public void displayMessage() {
        System.out.printf("Welcome to the grade book for %s\n", course.getName());
    }
    public void displayGradeReport() {
        Student lowest = getLowest();
        Student best = getBest();
        System.out.printf(
            "Class average is %.2f. Lowest grade is %d (Student: %s, id: %d)\n" +
            "Highest grade is %d (Student: %s, id: %d).\n" +
            "Grades distribution:\n%s",
            getAvg(), grades.get(lowest), lowest.getName(), lowest.getID(),
            grades.get(best), best.getName(), best.getID(),
            getDistribution()
        );
    }
    public Student getLowest() {
        Student lowest = null;
        for(Student student : grades.keySet()) {
            if(lowest == null || grades.get(lowest) > grades.get(student)){
                lowest = student;
            } 
        }
        return lowest;
    }
    public Double getAvg() {
        Double avg = 0.0;
        int numberOfMarks = 0;
        for(Student student : grades.keySet()){
            if(grades.get(student) != null) {
                avg += grades.get(student);
                numberOfMarks++;
            }
        }
        return avg / numberOfMarks;
    }
    public String getDistribution() {
        StringBuilder distribution = new StringBuilder();
        int[] distributionInt = new int[11];
        for(Student student : grades.keySet()){
            if(grades.get(student) == null) continue;
            distributionInt[
                grades.get(student) / 10
            ]++;
        }
        for(int i = 0; i < 10; i++){
            distribution.append(
                String.format("%02d-%02d: %s\n",
                     i * 10,
                     i * 10 + 9,
                     "*".repeat(distributionInt[i])
                 )
             );
        }
        distribution.append(String.format("100: %s\n", "*".repeat(distributionInt[10])));
        return distribution.toString();
    }
    public Student getBest() {
        Student best = null;
        for(Student student : grades.keySet()) {
            if(best == null || grades.get(best) < grades.get(student)){
                best = student;
            } 
        }
        return best;
    }
    public void setGradeForStudent(Student student, int grade) throws InvalidGradeException {
        if(grade > 100 || grade < 0) {
            throw new InvalidGradeException();
        }
        grades.put(student, grade);
    }
    private int getMaxLengthOfStudentsName() {
        int max = 0;
        for(Student student : grades.keySet()){
            if(max < student.getName().length()) max = student.getName().length();
        }
        return max;
    }
    @Override
    public String toString() {
        StringBuilder representation = new StringBuilder();
        representation.append("Course:\n");
        representation.append(course);
        representation.append(buildGradesTable());
        return representation.toString();

    }
    private String buildGradesTable() {
        StringBuilder table = new StringBuilder();
        int maxLength = getMaxLengthOfStudentsName() + "Student".length();
        table.append(
            String.format(
                "\n%s | Grade\n",
                extendString("Student", maxLength)
             )
         );
        for(Student student : grades.keySet()) {
            table.append(
                String.format(
                    "%s | %d\n",
                    extendString(student.getName(), maxLength),
                    grades.get(student)
                )
            );
        }
        return table.toString();
    }
    private String extendString(String s, int length) {
        return s.concat(" ".repeat(length - s.length()));
    }
    
    
}
