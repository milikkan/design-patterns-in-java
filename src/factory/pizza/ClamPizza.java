package factory.pizza;

import java.util.List;

public class ClamPizza extends Pizza {
    public ClamPizza() {
        this.name = "Clam Pizza";
        this.dough = "Thin with crust";
        this.sauce = "Tomato";
        this.toppings = List.of("olives", "mushroom");
    }
}
