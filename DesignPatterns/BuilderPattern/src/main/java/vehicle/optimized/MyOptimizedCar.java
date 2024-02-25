package vehicle.optimized;

/**
 * Builder pattern without field duplication and without DTO object
 * */
public class MyOptimizedCar {

    private MyOptimizedCarBuilder myOptimizedCarBuilder;

    private MyOptimizedCar(MyOptimizedCarBuilder myOptimizedCarBuilder) {
        this.myOptimizedCarBuilder = myOptimizedCarBuilder;
    }

    public static MyOptimizedCarBuilder builder() {
        return new MyOptimizedCarBuilder();
    }

    public String getEngine() {
        return myOptimizedCarBuilder.engine;
    }

    public int getDoors() {
        return myOptimizedCarBuilder.doors;
    }

    public int getSeats() {
        return myOptimizedCarBuilder.seats;
    }

    public String getTransmission() {
        return myOptimizedCarBuilder.transmission;
    }


    public static class MyOptimizedCarBuilder {
        private String engine;
        private int doors;
        private int seats;
        private String transmission;

        private MyOptimizedCarBuilder(){};

        public MyOptimizedCarBuilder engine(String engine) {
            this.engine = engine;
            return this;
        }
        public MyOptimizedCarBuilder doors(int doors) {
            this.doors = doors;
            return this;
        }
        public MyOptimizedCarBuilder seats(int seats) {
            this.seats = seats;
            return this;
        }
        public MyOptimizedCarBuilder transmission(String transmission) {
            this.transmission = transmission;
            return this;
        }
        private boolean isValid() {
            if (this.doors == 0 || this.seats == 0) {
                return false;
            }
            return true;
        }

        public MyOptimizedCar build() {
            if (!isValid()) {
                throw new RuntimeException("Cannot create object");
            }
            MyOptimizedCar car = new MyOptimizedCar(this);
            return car;
        }
    }
}
