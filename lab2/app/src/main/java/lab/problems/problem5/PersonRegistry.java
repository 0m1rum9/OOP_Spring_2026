package lab.problems.problem5;

import java.util.Vector;

public class PersonRegistry {
    private Vector<Person> people;
    
    public PersonRegistry() {
        this.people = new Vector<>();
    }
    
    public void addPerson(Person person) {
        if (!people.contains(person)) {
            people.add(person);
        }
    }
    
    public void removePerson(Person person) {
        people.remove(person);
    }
    
    public Vector<Person> getPeopleWithPets() {
        Vector<Person> result = new Vector<>();
        for (Person person : people) {
            if (person.hasPet()) {
                result.add(person);
            }
        }
        return result;
    }
    
    public Vector<Person> getPeopleWithoutPets() {
        Vector<Person> result = new Vector<>();
        for (Person person : people) {
            if (!person.hasPet()) {
                result.add(person);
            }
        }
        return result;
    }
    
    public Person findPersonByName(String name) {
        for (Person person : people) {
            if (person.getName().equals(name)) {
                return person;
            }
        }
        return null;
    }
    
    public int getSize() {
        return people.size();
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("--- Person Registry ---\n");
        for (Person person : people) {
            sb.append(person.toString()).append("\n");
        }
        return sb.toString();
    }
}
