package lab.problems.problem5;

public class Problem implements lab.problems.Problem {
    @Override
    public void solve() {
        Person john = new Employee("John", 30, "Engineer");
        Person alice = new PhDStudent("Alice", 26, "Computer Science", "AI");
        Person bob = new Student("Bob", 22, "Biology");

        Animal murka = new Cat("Murka", 5);
        Animal bobik = new Dog("Bobik", 3);
        Animal teodor = new Bird("teodor", 2);

        PersonRegistry registry = new PersonRegistry();
        registry.addPerson(john);
        registry.addPerson(alice);
        registry.addPerson(bob);

        System.out.println(registry);

        john.assignPet(bobik);
        alice.assignPet(murka);
        bob.assignPet(teodor );

        System.out.println(registry);

        Animal secondDog = new Dog("Buddy", 4);
        alice.assignPet(secondDog);
        System.out.println();

        System.out.println("People with pets: " + registry.getPeopleWithPets().size());
        System.out.println("People without pets: " + registry.getPeopleWithoutPets().size() + "\n");

        john.leavePetWith(alice);

        System.out.println(registry);

        john.retrievePetFrom(alice);

        System.out.println(registry);

    }

}
