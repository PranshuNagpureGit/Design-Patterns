import org.junit.Assert;
import org.junit.Test;


public class FlyingBulletTest {

    @Test
    public void testFlyweight() {
        FlyweightRegistry<BulletType, Bullet> bulletRegistry = new FlyweightRegistry<>();
        bulletRegistry.addIfAbsent(BulletType.MM_45, new Bullet());
        bulletRegistry.addIfAbsent(BulletType.MM_90, new Bullet());

        FlyingBullet flyingBullet_45mm_01 = FlyingBullet.builder()
                .xAxis(10)
                .yAxis(10)
                .zAxis(10)
                .direction('N')
                .radius(25)
                .speed(1000)
                .bullet(bulletRegistry.get(BulletType.MM_45))
                .build();

        FlyingBullet flyingBullet_45mm_02 = FlyingBullet.builder()
                .xAxis(10)
                .yAxis(10)
                .zAxis(10)
                .direction('N')
                .radius(25)
                .speed(1000)
                .bullet(bulletRegistry.get(BulletType.MM_45))
                .build();

        FlyingBullet flyingBullet_90mm_01 = FlyingBullet.builder()
                .xAxis(10)
                .yAxis(10)
                .zAxis(10)
                .direction('N')
                .radius(25)
                .speed(1000)
                .bullet(bulletRegistry.get(BulletType.MM_90))
                .build();

        Assert.assertTrue(flyingBullet_45mm_01.bullet == flyingBullet_45mm_02.bullet);
        Assert.assertTrue(flyingBullet_45mm_01.bullet != flyingBullet_90mm_01.bullet);
    }

}