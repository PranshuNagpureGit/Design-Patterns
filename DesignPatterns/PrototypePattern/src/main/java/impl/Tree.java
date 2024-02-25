package impl;

import interfaces.GraphicObject;

public class Tree implements GraphicObject {
    private int x;
    private int y;
    private GraphicObjectType graphicObjectType;
    private byte[] pixels;

    public Tree(int x, int y) {
        this.x = x;
        this.y = y;
        this.graphicObjectType = GraphicObjectType.TREE;
        calculatePixels();
    }
    private Tree(){};
    private Tree(Tree tree) {
        Tree newTree = new Tree();
        newTree.x = tree.x;
        newTree.y = tree.y;
        newTree.graphicObjectType = tree.graphicObjectType;
        newTree.pixels = tree.pixels;
    };

    /**
     * Let's say this is heavy computation
     * */
    private void calculatePixels() {
        System.out.println("Expensive tree calculation");
        pixels = new byte[1];
    }
    @Override
    public GraphicObject copy() {
        return new Tree(this);
    }
}
