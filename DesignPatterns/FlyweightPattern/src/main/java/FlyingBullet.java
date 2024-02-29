/**
 * Flyweight pattern helps in scalability as it optimizes memory by sharing the intrinsic state amongst objects of same type\
 * */
public class FlyingBullet {
    double x;
    double y;
    double z;
    double radius;
    char direction;
    double speed;
    Bullet bullet;

    private FlyingBullet(){};
    public FlyingBullet(FlyingBullet copy) {
        this.x = copy.x;
        this.y = copy.y;
        this.z = copy.z;
        this.radius = copy.radius;
        this.direction = copy.direction;
        this.speed = copy.speed;
        this.bullet = copy.bullet;
    }
    public static FlyingBulletBuilder builder() {
        return new FlyingBulletBuilder();
    }

    public static class FlyingBulletBuilder {
        private FlyingBullet flyingBulletDTO;

        public FlyingBulletBuilder() {
            flyingBulletDTO = new FlyingBullet();
        }

        public FlyingBulletBuilder xAxis(double x) {
            flyingBulletDTO.x = x;
            return this;
        }
        public FlyingBulletBuilder yAxis(double y) {
            flyingBulletDTO.y = y;
            return this;
        }
        public FlyingBulletBuilder zAxis(double z) {
            flyingBulletDTO.z = z;
            return this;
        }
        public FlyingBulletBuilder radius(double radius) {
            flyingBulletDTO.radius = radius;
            return this;
        }
        public FlyingBulletBuilder direction(char direction) {
            flyingBulletDTO.direction = direction;
            return this;
        }
        public FlyingBulletBuilder speed(double speed) {
            flyingBulletDTO.speed = speed;
            return this;
        }

        public FlyingBulletBuilder bullet(Bullet bullet) {
            flyingBulletDTO.bullet = bullet;
            return this;
        }

        public FlyingBullet build() {
            return new FlyingBullet(flyingBulletDTO);
        }

    }
}
