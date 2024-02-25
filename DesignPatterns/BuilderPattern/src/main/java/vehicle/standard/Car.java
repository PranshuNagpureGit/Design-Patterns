package vehicle.standard;
/**
 * Builder pattern is used for creation of objects which require large set of optional or mandatory arguments
 * Using constructor for such a scenario is not a maintainable approach.
 * Majority of times,client code ends up with telescopic constructors which is also an anti-pattern.
 *
 * Only Problem with the approach - Field Duplication
 * */
public class Car {

    private Car() {};
    private String engine;
    private int doors;
    private int seats;
    private String transmission;

    public static CarBuilder builder() {
        return new CarBuilder();
    }

    /**
     * Using inner class rather than a separate class enables the builder to access private fields.
     * This enables us to create builders for immutable classes, as we will not need setters and we can make class constructor as private.
     * This also allows us to make builder constructor private.
     * Moreover, a separate class for builder does not make sense for OOP.
     * */
    public static class CarBuilder {
        private String engine;
        private int doors;
        private int seats;
        private String transmission;
        private CarBuilder(){};

        public CarBuilder engine(String engine) {
            this.engine = engine;
            return this;
        }
        public CarBuilder doors(int doors) {
            this.doors = doors;
            return this;
        }
        public CarBuilder seats(int seats) {
            this.seats = seats;
            return this;
        }
        public CarBuilder transmission(String transmission) {
            this.transmission = transmission;
            return this;
        }

        private boolean isValid() {
            if (doors == 0 || seats == 0) {
                return false;
            }
            return true;
        }

        public Car build() {
            if (!isValid()) {
                throw new RuntimeException("Cannot create object");
            }
            Car car = new Car();
            car.engine = this.engine;
            car.doors = this.doors;
            car.seats = this.seats;
            car.transmission = this.transmission;
            return car;
        }
    }
}
