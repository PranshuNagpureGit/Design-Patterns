package correctway;

/**
 * Using composition to add new behaviors
 * Never use inheritance to tie behavior, otherwise it leads to class explosion.
 * */
public abstract class BeverageDecorator extends Beverage {
    public Beverage beverage;

    public BeverageDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
    public abstract String getDescription();
}
