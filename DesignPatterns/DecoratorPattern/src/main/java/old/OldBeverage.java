package old;

/**
 * OCP Violation - New condiments will cause cost method to change
 * SRP Violation - Price change in any condiment will cause our abstract class to change
 * For a beverage like Tea, having whip as a field/state does not make sense
 * */
public abstract class OldBeverage {
    String description;

    int whipCost = 10;
    boolean whip = false;

    public void setDescription(String description) {
        this.description = description;
    }

    public int cost () {
        if (whip) {
            return whipCost;
        }
        return 0;
    }

    public void setWhip(boolean whip) {
        this.whip = whip;
    }
}
