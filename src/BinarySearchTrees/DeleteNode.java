package BinarySearchTrees;

public class DeleteNode {
    public static class Node {
        int data;
        Node left;
        Node right;
        public Node(int data) {
            this.data = data;
        }
    }
    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    // Delete a node from BST
    public static Node delete(Node root, int val) {
        if (root.data > val) {
            root.left = delete(root.left, val);
        } else if (root.data < val) {
            root.right = delete(root.right, val);
        }
        else {
            if (root.left == null && root.right == null) {  // leaf node
                return null;
            }
            if (root.left == null) {    // only single right child
                return root.right;
            } else if (root.right == null) {    // only single left child
                return root.left;
            }
            // case 3: with both children
            Node inorderSuccessor = findInorderSuccessor(root.right);   // find the inorder successor - left most node in the right subTree
            root.data = inorderSuccessor.data;  // replace data with inorder successor data
            root.right = delete(root.right, inorderSuccessor.data); // delete inorder successor value
        }
        return root;
    }

    public static Node findInorderSuccessor(Node root) {    // find the inorder successor
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
    public static void main(String[] args) {
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();
        delete(root, 5);
        inorder(root);
        System.out.println();

    }
}
