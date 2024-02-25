package vehicle.optimized;

import org.junit.Assert;
import org.junit.Test;

public class OptimizedCarTest {

    @Test
    public void buildOptimizedCarTest() {
        OptimizedCar newCar = OptimizedCar.builder().engine("PETROL").doors(4).seats(4).transmission("AUTO").build();
        Assert.assertNotNull(newCar);
    }


}