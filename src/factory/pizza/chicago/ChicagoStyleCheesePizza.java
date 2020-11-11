package factory.pizza.chicago;

import factory.pizza.CheesePizza;

public class ChicagoStyleCheesePizza extends CheesePizza {
    public ChicagoStyleCheesePizza() {
        this.name = "Chicago style " + super.name;
    }
}
