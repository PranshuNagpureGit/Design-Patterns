package vehicle.optimized;

/**
 * Builder pattern without field duplication
 * */
public class OptimizedCar {

    private String engine;
    private int doors;
    private int seats;
    private String transmission;

    public static OptimizedCarBuilder builder() {
        return new OptimizedCarBuilder();
    }

    private OptimizedCar() {};

    /**
     * Copy constructor to reduce lines of code in build method
     * */
    private OptimizedCar(OptimizedCar car) {
        this.engine = car.engine;
        this.doors = car.doors;
        this.seats = car.seats;
        this.transmission = car.transmission;
    }

    public static class OptimizedCarBuilder {

        /**
         * Using composition to prevent re-declaring fields.
         * In a way using the class itself as a data transfer object(DTO).
         * */
        private OptimizedCar car;

        /**
         * Cannot share instances of the DTO as it will lead to erroneous output.
         * Hence creating each time.
         * */
        private OptimizedCarBuilder(){

            car = new OptimizedCar();
        };

        public OptimizedCarBuilder engine(String engine) {
            car.engine = engine;
            return this;
        }
        public OptimizedCarBuilder doors(int doors) {
            car.doors = doors;
            return this;
        }
        public OptimizedCarBuilder seats(int seats) {
            car.seats = seats;
            return this;
        }
        public OptimizedCarBuilder transmission(String transmission) {
            car.transmission = transmission;
            return this;
        }
        private boolean isValid() {
            if (car.doors == 0 || car.seats == 0) {
                return false;
            }
            return true;
        }

        public OptimizedCar build() {
            if (!isValid()) {
                throw new RuntimeException("Cannot create object");
            }
            /**
             * We are creating another object as we are just using the existing object as a DTO.
             * This is still optimized as we are using copy constructor to share some state (Shallow copy)
             * Moreover the DTO object will be garbage collected.
             * */
            OptimizedCar newCar = new OptimizedCar(car);
            return newCar;
        }
    }
}
