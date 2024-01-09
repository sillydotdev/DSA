package BinaryTrees;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class TopViewOfTree {
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

    public static class Info {  // info class to store Node data and its horizontal distance
        Node node;
        int horizontalDistance;
        public Info(Node node, int horizontalDistance) {
            this.node = node;
            this.horizontalDistance = horizontalDistance;
        }
    }
    public static void topView(Node root) {
        // Level order traversal
        Queue<Info> q = new LinkedList<>(); // Queue to store info for level order traversal
        HashMap<Integer, Node> map = new HashMap<>();   // to get top view

        int min = 0, max = 0;
        q.add(new Info(root, 0));   // root added to queue
        q.add(null);    // null added too like we do in Level order traversal

        while (!q.isEmpty()) {  // if queue is not empty
            Info curr = q.remove(); // remove from queue and store in in curr
            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                if (!map.containsKey(curr.horizontalDistance)) {    // if map already contains a horizontal distance, then that will not be inserted
                    map.put(curr.horizontalDistance, curr.node);
                }
                if (curr.node.left != null) {   // check for left of root
                    q.add(new Info(curr.node.left, curr.horizontalDistance-1)); // left side horizontal distance = root - 1
                    min = Math.min(min, curr.horizontalDistance-1);
                }
                if (curr.node.right != null) {  // check for right of root
                    q.add(new Info(curr.node.right, curr.horizontalDistance+1)); // right side horizontal distance  = root + 1
                    max = Math.max(max, curr.horizontalDistance+1);
                }
            }
        }

        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data+" "); // map.get(i).data because map.get(i) will give node but we need its data
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        topView(root);
    }
}
