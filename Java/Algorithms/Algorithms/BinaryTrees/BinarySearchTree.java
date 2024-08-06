package Java.Algorithms.Algorithms.BinaryTrees;

public class BinarySearchTree {
    //Constraints in binary tree
    /**
     * Items to the left must be less than the parent.
     * Items to the right must be greater than the parent.
     */
    //Naturally sorted
    //Best case search time = O(log(n))
    //Worst case search time = O(n)

    Node root;

    //Adding data to the tree
    //Helper function
    public void insert(int value){
        insert(this.root,value);
    }

    private Node insert(Node root, int value){
        if(root == null){
            root = new Node();
            root.data = value;
        }else if(value < root.data){
            //insert on the left
            //Using recursion when entering the data
            root.left = insert(root.left , value);
        }else if (value > root.data){
            //insert on the right
            root.right = insert(root.left,value);
        }

        return root;
    }

    /**
     * Traversing through the binary tree :
     * In order : Recursively visit left subtree, visit root, recursively visit right subtree --> Explore data sequentially
     * pre-order : Visit Root, Recursively visit left subtree,recursively visit right subtree.--> Explore root before leaves
     * Post-order : Recurse left subtree, recurse right subtree, visit root.--> Explore leaves before roots.
     */





}
