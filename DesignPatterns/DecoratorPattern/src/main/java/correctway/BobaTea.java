package correctway;

public class BobaTea extends Beverage {

    public BobaTea() {
        this.description = "Tea with boba";
    }
    @Override
    public int cost() {
        return 200;
    }
}
