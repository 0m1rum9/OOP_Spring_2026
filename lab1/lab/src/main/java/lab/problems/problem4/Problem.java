
package lab.problems.problem4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import lab.problems.problem4.student.Student;
import lab.problems.problem4.student.StudyYear;

/**
 * Problem
 */
public class Problem implements lab.problems.Problem {
    private Scanner scanner;

    public Problem(Scanner scanner) {
        this.scanner = scanner;
    }

    public void solve() {
        List<Student> students = new ArrayList<>();
        String letters = "ABCDEFGHJKL";
        for (int i = 0; i < letters.length(); i++) {
            students.add(
                    new Student("" + letters.charAt(i), i, StudyYear.First));
        }
        GradeBook g = new GradeBook(
                new Course("OOP", "bla bla", 123),
                students
        );
        // Random grades
        // for(Student student : students) {
        // g.setGradeForStudent(student, (int)(Math.random() * 100));
        // }
        g.displayMessage();
        System.out.println("\nPlease, input grades for students\n");
        for (Student student : students) {
            boolean success = false;
            while (!success) {
                System.out.printf("Student %s: ", student.getName());
                String grade = scanner.nextLine();
                try {
                    g.setGradeForStudent(student, Integer.parseInt(grade));
                    success = true;
                } catch (NumberFormatException e) {
                    System.out.println("Grade must be integer");
                } catch(InvalidGradeException e) {
                    System.out.println("Grade must be <= 100 and >= 0");
                }
            }
        }
        g.displayGradeReport();
    }

}
