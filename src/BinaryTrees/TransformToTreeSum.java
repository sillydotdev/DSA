package BinaryTrees;
public class TransformToTreeSum  {
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

    // Transform to Tree Sum
    public static int transformToTreeSum(Node root) {
        if (root == null) {
            return 0;
        }

        int leftChild = transformToTreeSum(root.left);
        int rightChild = transformToTreeSum(root.right);

        int data = root.data;

        int newLeft = root.left == null ? 0 : root.left.data;   // for leaf nodes root.left = 0
        int newRight = root.right == null ? 0 : root.right.data;

        root.data = newLeft + leftChild + newRight + rightChild;
        return data;
    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        preOrder(root);
        System.out.println();
        transformToTreeSum(root);
        preOrder(root);
    }
}

