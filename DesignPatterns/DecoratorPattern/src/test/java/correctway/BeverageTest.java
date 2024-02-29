package correctway;

import org.junit.Assert;
import org.junit.Test;

public class BeverageTest {

    @Test
    public void testCost() {
        Beverage capuccino = new Capuccino();
        Beverage whippedCapuccino = new WhippedCreamDecorator(capuccino);
        Beverage bobaTea = new BobaTea();

        Assert.assertEquals(200, bobaTea.cost());
        Assert.assertEquals(160, whippedCapuccino.cost());
        Assert.assertEquals(150, capuccino.cost());
    }

    @Test
    public void testDescription() {
        Beverage espresso = new Espresso();
        Beverage whippedEspresso = new WhippedCreamDecorator(espresso);

        Assert.assertEquals("Black Coffee", espresso.getDescription());
        Assert.assertEquals("Black Coffee, whipped cream", whippedEspresso.getDescription());
    }

}