package LinkedList;

public class RemoveCycleInLinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;

    // cycle exists or not
    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    // Remove cycle in a LinkedList
    public static void removeCycle() {
        Node slow = head;
        Node fast = head;
        // whether cycle exists or not
        boolean cycleExists = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycleExists = true;
                break;
            }
        }
        if (cycleExists == false) {
            return;
        }
        // find meeting point of the linkedList
        slow = head;
        Node prev = null;
        while (slow  != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;   // remove cycle by pointing last node to null
    }
    public static void main(String[] args) {
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;

        System.out.println("Before remove function, cycle exists: "+isCycle());
        removeCycle();
        System.out.println("After remove function, cycle exists: "+isCycle());
    }
}
