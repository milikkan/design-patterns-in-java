package factory.store;

import factory.pizza.ny.NYStyleVeggiePizza;
import factory.pizza.Pizza;
import factory.pizza.ny.NYStyleCheesePizza;
import factory.pizza.ny.NYStyleClamPizza;
import factory.pizza.ny.NYStylePepperoniPizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new NYStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new NYStylePepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new NYStyleClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new NYStyleVeggiePizza();
        }

        return pizza;
    }
}
