package Java.Algorithms.Algorithms.BinaryTrees;

import static Java.Algorithms.Algorithms.ArrayAlgorithms.makeGap;

public class TreesMain {
    public static void main(String[] args) {
        makeGap("Binary Tree insert algorithm");
        //Creating a root node
        Node rootNode = new Node();
        rootNode.data = 2;

        //Creating a tree
        BinarySearchTree tree = new BinarySearchTree();
        tree.root = rootNode;

        tree.insert(1);
        tree.insert(4);
        tree.insert(3);

    }
}
