package factory.pizza.ny;

import factory.pizza.CheesePizza;

public class NYStyleCheesePizza extends CheesePizza {
    public NYStyleCheesePizza() {
        this.name = "NY Style " + super.name;
    }
}
