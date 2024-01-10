package BinaryTrees;

import java.util.ArrayList;

public class LowestCommonAncestor  {
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

    /*
    *  Time complexity = O(n)
    *  Space complexity = O(n)
    * */
    public static boolean getPath(Node root, int n, ArrayList<Node> path) { // function to calculate the path of node
        if (root == null) {
            return false;
        }

        path.add(root); // add the root node

        if (root.data == n) {   // if root  = n, return true
            return true;
        }
        boolean foundLeft = getPath(root.left, n, path);    // else find in left of root
        boolean foundRight = getPath(root.right, n, path);  // find in right of root

        if (foundLeft || foundRight) {  // if n is found in either left or right of root
            return true;
        }
        path.remove(path.size() - 1);   // else remove the last
        return false;
    }
    public static Node lowestCommonAncestor(Node root, int n1, int n2) {
        ArrayList<Node> path1 = new ArrayList<>();  // arraylist for storing paths of n1 and n2
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root, n1, path1);   // getting the path of n1
        getPath(root, n2, path2);   // getting the path of n2

        int i;
        for (i = 0; i < path1.size() && i < path2.size(); i++) {    // traversing the path in arraylist
            if (path1.get(i) != path2.get(i)) { // as soon as the paths don't match, we break
                break;
            }
        }
        Node lca = path1.get(i - 1);    // lowest common ancestor will the previous index of where the paths didn't math, therefore -1
        return lca; // return the node as LCA
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
        System.out.println(lowestCommonAncestor(root, n1, n2).data);
    }
}
