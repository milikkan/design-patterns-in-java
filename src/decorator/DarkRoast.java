package decorator;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        this.description = "Dark Roast Coffee";
    }
    public double cost() {
        return .99;
    }
}
