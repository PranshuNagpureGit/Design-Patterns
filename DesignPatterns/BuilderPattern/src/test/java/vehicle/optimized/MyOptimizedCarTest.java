package vehicle.optimized;


import org.junit.Assert;
import org.junit.Test;

public class MyOptimizedCarTest {

    @Test
    public void buildMyOptimizedCarTest() {
        MyOptimizedCar newCar = MyOptimizedCar.builder().engine("PETROL").doors(4).seats(4).transmission("AUTO").build();
        Assert.assertNotNull(newCar);
    }


}