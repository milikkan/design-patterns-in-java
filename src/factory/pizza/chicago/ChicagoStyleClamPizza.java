package factory.pizza.chicago;

import factory.pizza.ClamPizza;

public class ChicagoStyleClamPizza extends ClamPizza {
    public ChicagoStyleClamPizza() {
        this.name = "Chicago style " + super.name;
    }
}
