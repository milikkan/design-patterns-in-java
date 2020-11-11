package factory.store;

import factory.pizza.chicago.ChicagoStyleVeggiePizza;
import factory.pizza.Pizza;
import factory.pizza.chicago.ChicagoStyleCheesePizza;
import factory.pizza.chicago.ChicagoStyleClamPizza;
import factory.pizza.chicago.ChicagoStylePepperoniPizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new ChicagoStylePepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ChicagoStyleClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new ChicagoStyleVeggiePizza();
        }

        return pizza;
    }
}
