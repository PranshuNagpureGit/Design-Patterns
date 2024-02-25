package vehicle.standard;

import org.junit.Assert;
import org.junit.Test;

public class CarTest {

    @Test
    public void buildCarTest() {
        Car newCar = Car.builder().engine("PETROL").doors(4).seats(4).transmission("AUTO").build();
        Assert.assertNotNull(newCar);
    }

}