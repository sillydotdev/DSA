package BinaryTrees;

public class MinimumDistanceBetweenNodes  {
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

    // LCA of 2 nodes
    public static Node lowestCommonAncestor(Node root, int n1, int n2) {
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }
        Node leftLCA = lowestCommonAncestor(root.left, n1, n2);
        Node rightLCA = lowestCommonAncestor(root.right, n1, n2);

        if (rightLCA == null) {
            return leftLCA;
        }
        if (leftLCA == null) {
            return leftLCA;
        }
        return root;
    }

    // Calculate the distance between LCA and nodes
    public static int lcaDistance(Node root, int n) {   // distance from LCA to a node
        if (root == null) {
            return -1;
        }
        if (root.data == n) {   // if node is the root
            return 0;
        }

        int leftDistance = lcaDistance(root.left, n);   // left node distance
        int rightDistance = lcaDistance(root.right, n); // right node distance

        if (leftDistance == -1 && rightDistance == -1) {    // if both left and right return -1 - means node is not present
            return -1;
        } else if (leftDistance == -1) {    // if node is not on the left
            return rightDistance + 1;
        } else {
            return leftDistance + 1;    // if node is not on the right
        }
    }

    // Minimum distance between 2 nodes
    public static int minimumDistance(Node root, int n1, int n2) {
        Node lca = lowestCommonAncestor(root, n1, n2);  // calculate LCA of nodes
        int distance1 = lcaDistance(lca, n1);   // distance from n1 to LCA
        int distance2 = lcaDistance(lca, n2);   // distance from n2 to LCA

        return distance1 + distance2;   // total minimum distance
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n1 = 4, n2 = 6;
//        int n1 = 4, n2 = 5;

        System.out.println(minimumDistance(root, n1, n2));
    }
}
