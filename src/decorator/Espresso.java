package decorator;

public class Espresso extends Beverage {
    public Espresso() {
        this.description = "Espresso";
    }
    public double cost() {
        return 2.99;
    }
}
