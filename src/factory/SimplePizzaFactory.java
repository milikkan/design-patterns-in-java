package factory;

import factory.pizza.*;

public class SimplePizzaFactory {
    public Pizza createPizza(String type) throws Exception {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        } else {
            throw new Exception("Sorry. We don't have that kind of pizza...");
        }

        return pizza;
    }
}
