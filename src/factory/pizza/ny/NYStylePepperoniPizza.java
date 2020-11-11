package factory.pizza.ny;

import factory.pizza.PepperoniPizza;

public class NYStylePepperoniPizza extends PepperoniPizza {
    public NYStylePepperoniPizza() {
        this.name = "NY Style " + super.name;
    }
}
