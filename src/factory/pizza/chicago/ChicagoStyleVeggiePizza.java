package factory.pizza.chicago;

import factory.pizza.VeggiePizza;

public class ChicagoStyleVeggiePizza extends VeggiePizza {
    public ChicagoStyleVeggiePizza() {
        this.name = "Chicago style " + super.name;
    }
}
