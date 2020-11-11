package factory.pizza.ny;

import factory.pizza.ClamPizza;

public class NYStyleClamPizza extends ClamPizza {
    public NYStyleClamPizza() {
        this.name = "NY Style " + super.name;
    }
}
