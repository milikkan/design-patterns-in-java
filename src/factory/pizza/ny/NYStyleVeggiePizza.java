package factory.pizza.ny;

import factory.pizza.VeggiePizza;

public class NYStyleVeggiePizza extends VeggiePizza {
    public NYStyleVeggiePizza() {
        this.name = "NY Style " + super.name;
    }
}
