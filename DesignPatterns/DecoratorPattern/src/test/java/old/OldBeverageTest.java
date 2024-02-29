package old;

import org.junit.Assert;
import org.junit.Test;

public class OldBeverageTest {

    @Test
    public void testCost() {
        OldEspresso espresso = new OldEspresso();
        espresso.setDescription("Black coffee");
        espresso.setWhip(true);

        Assert.assertEquals(110, espresso.cost());
    }

}