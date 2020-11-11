package factory.pizza;

import java.util.List;

public class PepperoniPizza extends Pizza {
    public PepperoniPizza() {
        this.name = "Pepperoni Pizza";
        this.dough = "Standart with crust";
        this.sauce = "Spicy";
        this.toppings = List.of("olives", "pepperoni", "mushroom", "tomato");
    }
}
