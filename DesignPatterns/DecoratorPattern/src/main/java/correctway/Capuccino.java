package correctway;

public class Capuccino extends Beverage {

    public Capuccino() {
        this.description = "Coffee with milk";
    }

    @Override
    public int cost() {
        return 150;
    }
}
