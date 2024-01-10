package BinaryTrees;

import java.util.ArrayList;

public class KthAncestor  {
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
    // Kth ancestor of a node
    public static int kthAncestor(Node root, int n, int k) {
        if (root == null) {
            return -1;
        }
        if (root.data == n) {
            return 0;
        }
        int leftDistance = kthAncestor(root.left, n, k);    // left distance
        int rightDistance = kthAncestor(root.right, n, k);  // right distance

        if (leftDistance == -1 && rightDistance == -1) {    // if both left and right don't have n
            return -1;
        }
        int max = Math.max(leftDistance, rightDistance);    // max of left and right
        if (max + 1 == k) {             // if max + 1 == k
            System.out.println(root.data);
        }
        return max + 1;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n = 4, k = 2;
        kthAncestor(root, n, k);
    }
}
