package old;

import old.OldBeverage;

public class OldCapuccino extends OldBeverage {

    @Override
    public int cost() {
        return super.cost() + 150;
    }
}
