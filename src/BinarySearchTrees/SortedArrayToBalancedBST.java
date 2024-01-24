package BinarySearchTrees;

public class SortedArrayToBalancedBST {
    public static class Node {
        int data;
        Node left;
        Node right;
        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    // Sorted Array to Balanced BST
    public static Node sortedToBalancedBST(int arr[], int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = start + (end - start) / 2;
        Node root = new Node(arr[mid]);
        root.left = sortedToBalancedBST(arr, start, mid-1);
        root.right = sortedToBalancedBST(arr, mid+1, end);
        return root;
    }
    public static void main(String[] args) {
        int arr[] = {3, 5, 6, 8, 10, 11, 12};
        Node root = sortedToBalancedBST(arr, 0, arr.length-1);
        preorder(root);
    }
}
