package lab.problems.problem6;

public abstract class Person implements Cloneable {
    protected String name;
    protected int age;
    protected Animal pet;
    protected Animal temporaryPet;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.pet = null;
        this.temporaryPet = null;
    }

    public abstract String getOccupation();

    public void assignPet(Animal pet) {
        if (!canHavePet(pet)) {
            System.out.println(name + " cannot have a " + pet.getClass().getSimpleName());
            return;
        }
        this.pet = pet;
    }

    public void removePet() {
        this.pet = null;
    }

    public boolean hasPet() {
        return this.pet != null;
    }

    protected boolean canHavePet(Animal pet) {
        return true;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Animal getPet() {
        return pet;
    }

    public void leavePetWith(Person caretaker) {
        if (!hasPet()) {
            System.out.println(name + " doesn't have a pet to leave.");
            return;
        }

        Animal petToLeave = this.pet;

        if (!caretaker.canHavePet(petToLeave)) {
            System.out.println(caretaker.getName() + " cannot take care of " + petToLeave.getClass().getSimpleName());
            return;
        }

        this.pet = null;
        caretaker.temporaryPet = petToLeave;
        System.out.println(name + " left " + petToLeave.getName() + " (" + petToLeave.getClass().getSimpleName()
                + ") with " + caretaker.getName());
    }

    public void retrievePetFrom(Person caretaker) {
        if (caretaker.temporaryPet == null) {
            System.out.println(caretaker.getName() + " doesn't have a pet to return.");
            return;
        }

        this.pet = caretaker.temporaryPet;
        caretaker.temporaryPet = null;
        System.out.println(name + " retrieved " + pet.getName() + " from " + caretaker.getName());
    }

    @Override
    public String toString() {
        String petInfo = hasPet() ? pet.toString() : "No pet";
        String tempPetInfo = temporaryPet != null ? " (caring for: " + temporaryPet.toString() + ")" : "";
        return name + " (" + getOccupation() + ", age " + age + ") - " + petInfo + tempPetInfo;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Person))
            return false;
        Person other = (Person) obj;
        return this.name.equals(other.name) && this.age == other.age;
    }

    @Override
    public int hashCode() {
        return name.hashCode() * 31 + age;
    }

    @Override
    public Person clone() {
        try {
            Person copy = (Person) super.clone();
            copy.pet = null;
            copy.temporaryPet = null;
            return copy;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
