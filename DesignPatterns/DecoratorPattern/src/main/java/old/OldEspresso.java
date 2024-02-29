package old;

import old.OldBeverage;

public class OldEspresso extends OldBeverage {

    @Override
    public int cost() {
        return super.cost() + 100;
    }
}
