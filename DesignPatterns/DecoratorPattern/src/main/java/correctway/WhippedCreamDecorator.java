package correctway;

public class WhippedCreamDecorator extends BeverageDecorator {

    public WhippedCreamDecorator(Beverage beverage) {
        super(beverage);
    }
    @Override
    public int cost() {
        return beverage.cost() + 10;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", whipped cream";
    }
}
