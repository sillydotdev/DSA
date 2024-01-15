package BinarySearchTrees;

public class BuildBST {
    public static class Node {
        int data;
        Node left;
        Node right;
        public Node(int data) {
            this.data = data;
        }
    }
    // Build a BST
    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);   // insert at root
            return root;
        }
        if (root.data > val) {
            root.left = insert(root.left, val); // if value is less than root, insert on the left side
        } else {
            root.right = insert(root.right, val);   // else insert on the right side
        }
        return root;
    }

    // inorder traversal
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        int values[] = {5, 1, 3, 4, 2, 7};
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();
    }
}
