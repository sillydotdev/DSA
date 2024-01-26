package BinarySearchTrees;

import java.util.ArrayList;

public class MergeBSTs {
    public static class Node {
        int data;
        Node left, right;
        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    // preorder
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    // Inorder
    public static void getInorder(Node root, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }
        getInorder(root.left, arr);
        arr.add(root.data);
        getInorder(root.right, arr);
    }

    // create BST from sorted array
    public static Node createBST(ArrayList<Integer> arr, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = start + (end - start) / 2;
        Node root = new Node(arr.get(mid));
        root.left = createBST(arr, start, mid-1);
        root.right = createBST(arr, mid+1, end);

        return root;
    }

    // merge 2 BSTs
    public static Node mergeBSTs(Node root1, Node root2) {
        // inorder of BST 1
        ArrayList<Integer> arr1 = new ArrayList<>();
        getInorder(root1, arr1);

        // inorder of BST 2
        ArrayList<Integer> arr2 = new ArrayList<>();
        getInorder(root2, arr2);

        // merge 2 BSTs
        int i = 0, j = 0;
        ArrayList<Integer> finalArray = new ArrayList<>();
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) <= arr2.get(j)) {
                finalArray.add(arr1.get(i));
                i++;
            } else {
                finalArray.add(arr2.get(j));
                j++;
            }
        }
        while (i < arr1.size()) {
            finalArray.add(arr1.get(i));
            i++;
        }
        while (j < arr2.size()) {
            finalArray.add(arr2.get(j));
            j++;
        }

        // sorted array -> Balanced BST
        return createBST(finalArray, 0, finalArray.size()-1);
    }
    public static void main(String[] args) {
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        Node root = mergeBSTs(root1, root2);
        preorder(root);
    }
}
