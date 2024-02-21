package threadsafe;

/**
 *
 * In this version, the InstanceHolder class is responsible for holding the singleton instance,
 * which is initialized eagerly but lazily loaded only when getInstance() is first called.
 *
 * TODO : What happens in case of
 *  1) Multiple class loaders
 *  2) Class unloading
 * */
public class InitOnDemandSingleton {

    private static class InstanceHolder {
        private static final InitOnDemandSingleton INSTANCE = new InitOnDemandSingleton();
    }

    private InitOnDemandSingleton(){};

    public static InitOnDemandSingleton getInstance() {
        return InstanceHolder.INSTANCE;
    }
}
