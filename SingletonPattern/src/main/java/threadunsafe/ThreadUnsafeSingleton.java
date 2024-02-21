package threadunsafe;

/**
 * This class will create multiple objects in a multi-threaded scenario.
 * This class uses lazy initialization
 * */
public class ThreadUnsafeSingleton {
    private static ThreadUnsafeSingleton instance;

    private ThreadUnsafeSingleton() {};

    public static ThreadUnsafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadUnsafeSingleton();
        }
        return instance;
    }

}
