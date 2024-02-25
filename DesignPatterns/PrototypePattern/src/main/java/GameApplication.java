import impl.Bird;
import impl.GraphicObjectType;
import impl.Tree;
import interfaces.GraphicObject;
import registry.GameRegistry;

import java.util.ArrayList;
import java.util.List;
/**
 * Using prototype pattern (copy and registry) when object creation is an intensive process.
 * Hence, we create prototypes and keep them in a registry. These prototypes can be used to create clones/copies which can be customized.
 * Additionally, this pattern helps to decouple the client-code/business logic = (createGame method) with the subclasses.
 * */
public class GameApplication {

    public static void main (String[] args) {
        createPrototypes();
        createGame();
    }

    private static void createGame() {
        GraphicObject treePrototype = GameRegistry.getInstance().get(GraphicObjectType.TREE);
        GraphicObject birdPrototype = GameRegistry.getInstance().get(GraphicObjectType.BIRD);
        List<GraphicObject> allGraphicObjects = new ArrayList<>();
        for(int i = 0; i< 10;i++) {
            allGraphicObjects.add(treePrototype.copy());
            allGraphicObjects.add(birdPrototype.copy());
        }
    }

    private static void createPrototypes() {
        GameRegistry.getInstance().add(GraphicObjectType.TREE, new Tree(100,100));
        GameRegistry.getInstance().add(GraphicObjectType.BIRD, new Bird(200,200));
    }
}
