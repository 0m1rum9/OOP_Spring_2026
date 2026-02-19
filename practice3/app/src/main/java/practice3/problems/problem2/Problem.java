
package practice3.problems.problem2;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

/**
 * Problem
 */
public class Problem implements practice3.problems.Problem {

    private Scanner scanner;

    public Problem(Scanner scanner) {
        this.scanner = scanner;
    }

    public void solve() {
        Vector<Person> people = new Vector<>();
        processInput(people);
    }

    public void processInput(Vector<Person> people) {
        while (true) {
            System.out.print("Print info about all added persons -> 1\nAdd a new person -> 2\n");
            try {
                int option = scanner.nextInt();
                if (option == 1) {
                    int i = 1;
                    for (Person person : people) {
                        System.out.printf("%d. %s\n", i, person);
                        i++;
                    }
                } else if (option == 2) {
                    while (true) {
                        try {
                            System.out.print("Add Person -> 1\nAdd Student -> 2\nAdd Staff -> 3:\n");
                            int personType = scanner.nextInt();
                            if (personType == 1) {
                                System.out.println("Enter in format: <name> <address>: ");
                                String name = scanner.next();
                                String address = scanner.next();
                                people.add(new Person(name, address));
                            } else if (personType == 2) {
                                System.out.println("Enter in format: <name> <address> <program> <year> <fee>: ");
                                String name = scanner.next();
                                String address = scanner.next();
                                String program = scanner.next();
                                int year = scanner.nextInt();
                                double fee = scanner.nextDouble();
                                people.add(new Student(name, address, program, year, fee));
                            } else if(personType == 3) {
                                System.out.println("Enter in format: <name> <address> <school> <pay>: ");
                                String name = scanner.next();
                                String address = scanner.next();
                                String school = scanner.next();
                                double pay = scanner.nextDouble();
                                people.add(new Staff(name, address, school, pay));
                            } else {
                                System.out.println("Incorrect input");
                                continue;
                            }
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Incorrect input");
                        }
                    }
                } else {
                    System.out.println("Incorrect input");
                }
            } catch (InputMismatchException e) {
                System.out.println("Incorrect input");
            }
        }
    }
}
