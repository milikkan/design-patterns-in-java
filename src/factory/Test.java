package factory;

import factory.store.ChicagoPizzaStore;
import factory.store.NYPizzaStore;
import factory.store.PizzaStore;

public class Test {
    public static void main(String[] args) {
        //SimplePizzaFactory factory = new SimplePizzaFactory();
        //PizzaStore store = new PizzaStore(factory);
        PizzaStore store1 = new NYPizzaStore();
        store1.orderPizza("cheese");
        System.out.println("--------------------------");
        PizzaStore store2 = new ChicagoPizzaStore();
        store2.orderPizza("clam");
    }
}
