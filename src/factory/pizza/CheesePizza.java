package factory.pizza;

import java.util.List;

public class CheesePizza extends Pizza {
    public CheesePizza() {
        this.name = "Cheese Pizza";
        this.dough = "Thin with crust";
        this.sauce = "Tomato";
        this.toppings = List.of("olives", "pepperoni", "mushroom");
    }
}
