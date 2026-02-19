

package practice3.problems.problem2;

/**
 * Person
 */
public class Person {

    protected String name;
    protected String address;
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
    public String getName(){
        return this.name;
    }
    public String getAddress() {
        return this.address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return String.format(
            "Person[Name: %s, Address: %s]",
            name, address
        );
    }
    
}
