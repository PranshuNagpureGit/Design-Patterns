package registry;

import impl.GraphicObjectType;
import interfaces.GraphicObject;

import java.util.HashMap;
import java.util.Map;

public class GameRegistry {
    Map<GraphicObjectType, GraphicObject> registry;

    private static volatile GameRegistry instance;

    private GameRegistry() {
        registry = new HashMap<>();
    }
    public static GameRegistry getInstance() {
        if (instance == null) {
            synchronized (GameRegistry.class) {
                if (instance == null) {
                    instance = new GameRegistry();
                }
            }
        }
        return instance;
    }

    public void add(GraphicObjectType graphicObjectType, GraphicObject graphicObject) {
        registry.put(graphicObjectType, graphicObject);
    }

    public GraphicObject get(GraphicObjectType graphicObjectType) {
        return registry.get(graphicObjectType);
    }
}
