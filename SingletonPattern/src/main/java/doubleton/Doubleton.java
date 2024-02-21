package doubleton;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Implement a singleton pattern with a twist. First, instead of storing one instance, store two instances.
 * In every even call of getInstance() return the first instance
 * and in every odd call of getInstance() return the second instance
 * */
public class Doubleton {
    private static volatile Doubleton instance_1;
    private static volatile Doubleton instance_2;
    private static volatile AtomicLong invocations;

    private Doubleton() {};

    static {
        invocations = new AtomicLong(0);
    }

    public static Doubleton getInstance() {
        long invocationsTillNow = invocations.addAndGet(1l);
        if((invocationsTillNow&1) == 0) {
            return getEvenInstance();
        } else {
            return getOddInstance();
        }
    }

    private static Doubleton getOddInstance() {
        if (instance_2 == null) {
            synchronized (Doubleton.class) {
                if (instance_2 == null) {
                    instance_2 = new Doubleton();
                }
            }
        }
        return instance_2;
    }

    private static Doubleton getEvenInstance() {
        if (instance_1 == null) {
            synchronized (Doubleton.class) {
                if (instance_1 == null) {
                    instance_1 = new Doubleton();
                }
            }
        }
        return instance_1;
    }
}
