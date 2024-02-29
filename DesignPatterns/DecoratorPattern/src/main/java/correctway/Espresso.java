package correctway;

public class Espresso extends Beverage {
    public Espresso() {
        this.description = "Black Coffee";
    }
    @Override
    public int cost() {
        return 100;
    }
}
