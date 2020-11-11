package factory.pizza;

import factory.pizza.Pizza;

import java.util.List;

public class VeggiePizza extends Pizza {
    public VeggiePizza() {
        this.name = "Veggie Pizza";
        this.dough = "Normal";
        this.sauce = "Tomato";
        this.toppings = List.of("olives", "mushroom", "cheese", "eggplant");
    }
}
