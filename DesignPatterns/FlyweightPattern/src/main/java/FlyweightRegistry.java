import java.util.HashMap;
import java.util.Map;

public class FlyweightRegistry<A, B> {
    private Map<A,B> registry = new HashMap<>();

    public void addIfAbsent(A a,B b) {
        registry.putIfAbsent(a,b);
    }

    public B get(A a) {
        return registry.get(a);
    }
}
