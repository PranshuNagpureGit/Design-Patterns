/**
 * Extracting the intrinsic state (i.e which does not change) out to a separate class
 * Image is a heavy field which can be shared amongst multiple bullets.
 * */
public class Bullet {
    BulletType bulletType;
    byte[] image;

}
