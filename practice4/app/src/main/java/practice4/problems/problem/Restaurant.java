
package practice4.problems.problem;

/**
 * Restaurant
 */
public class Restaurant {

    private String name;

    public boolean servePizza(CanHavePizza client, Pizza pizza) {
        if (client instanceof Cat) { // free pizza for cats
            if (servePizzaToCat((Cat) client, pizza)) {
                System.out.println("Served ✅");
                return true;
            } else {
                System.out.println("Client is not able to eat pizza ❌");
                return false;
            }
        }
        if (client instanceof Student) {
            if (servePizzaToStudent((Student) client, pizza)) {
                System.out.println("Served ✅");
                return true;
            } else {
                System.out.println("Client is not able to eat pizza ❌");
                return false;
            }
        }
        return client.eatPizza(pizza);
    }

    private boolean servePizzaToCat(Cat cat, Pizza pizza) {
        return cat.eatPizza(pizza);
    }

    private boolean servePizzaToStudent(Student student, Pizza pizza) {
        if (student.eatPizza(pizza)) {
            return student.Pay(pizza.price);
        } else
            return false;
    }
}
