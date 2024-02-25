package threadsafe;

/**
 * This is an eager initialization implementation of the Singleton pattern because the singleton instance is created eagerly,
 * i.e., as soon as the class is loaded into memory, regardless of whether it is needed or not.
 *
 * Eager initialization has the advantage of simplicity and thread safety, as the JVM guarantees
 * that static initialization is performed only once during class loading.
 *
 * However, it may lead to increased startup time and memory consumption if the singleton object is resource-intensive
 * and not always needed.
 *
 * TODO : What happens in case of
 *  1) Multiple class loaders
 *  2) Class unloading
 * */
public class EagerInitializationSingleton {
    private static final EagerInitializationSingleton INSTANCE = new EagerInitializationSingleton();
    private EagerInitializationSingleton(){
        System.out.println("Created");
    };

    public static EagerInitializationSingleton getInstance() {
        return INSTANCE;
    }
}
