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

        Node rootNode1 = new Node();
        rootNode1.data = 5;
        Node nodetwo = new Node();
        nodetwo.data = 2;
        Node nodefour = new Node();
        nodefour.data = 4;
        Node nodeNine = new Node();
        nodeNine.data = 9;
        Node nodeSeven = new Node();
        nodeSeven.data = 7;

        rootNode1.left = nodetwo;
        rootNode1.right = nodefour;
        rootNode1.right = nodeNine;
        rootNode1.left = nodeSeven;

        BinarySearchTree tree2 = new BinarySearchTree();
        tree2.root = rootNode1;


        tree.preOrderTraversal();
        System.out.println();

    }
}
