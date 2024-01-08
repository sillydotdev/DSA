package BinaryTrees;

public class DiameterOfTree {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // height of tree
    public static int heightOfTree (Node root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    // Diameter of a tree
    public static int diameter(Node root) {     // Time Complexity = o(n^2)
        if (root == null) {
            return 0;
        }

        int leftDiameter = diameter(root.left);
        int leftHeight = heightOfTree(root.left);
        int rightDiameter = diameter(root.right);
        int rightHeight = heightOfTree(root.right);

        int selfDiameter = leftHeight + rightHeight + 1;

        return Math.max(selfDiameter, Math.max(leftDiameter, rightDiameter));
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(diameter(root));
    }
}
