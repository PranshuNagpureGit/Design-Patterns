package threadsafe;

/**
 * Double-checked locking implementation of Singleton.
 * Volatile is important here. Understand why - https://www.cs.umd.edu/~pugh/java/memoryModel/DoubleCheckedLocking.html
 * */
public class DoubleCheckedLocking {
    private static volatile DoubleCheckedLocking instance;

    private DoubleCheckedLocking() {};

    public static DoubleCheckedLocking getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLocking.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLocking();
                }
            }
        }
        return instance;
    }
}
