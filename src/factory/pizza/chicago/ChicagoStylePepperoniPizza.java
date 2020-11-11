package factory.pizza.chicago;

import factory.pizza.PepperoniPizza;

public class ChicagoStylePepperoniPizza extends PepperoniPizza {
    public ChicagoStylePepperoniPizza() {
        this.name = "Chicago style " + super.name;
    }
}
