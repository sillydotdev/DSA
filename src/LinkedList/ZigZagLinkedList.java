package LinkedList;

public class ZigZagLinkedList {
    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    // add Node at the head -------- TC = O(1)
    public void addFirst(int data) {
        // step-1: create a new Node
        Node newNode = new Node(data);
        size++;
        if(head == null) {  // if there is no node in the linkedList in the first place
            head = tail = newNode;
            return;
        }
        // step-2: newNode's next points to head
        newNode.next = head;
        // step-3: newNode = head
        head = newNode;
    }
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    /*
    Print LinkedList in a ZIG-ZAG pattern
     */
    // Find the mid
    public static Node findMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;    // which is the mid of the LinkedList
    }

    public static void zigZag() {
        if(head == null || head.next == null || head.next.next == null) {
            return;
        }

        // find mid
        Node mid = findMid(head);

        //Reverse 2nd half
        Node curr = mid.next;   // because mid is to be included as last node of Ist half
        mid.next = null;    // divide into 2 halves
        Node prev = null;   // variable
        Node next;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node rightHead = prev;
        Node leftHead = head;

        Node nextLeft;
        Node nextRight;

        while (leftHead != null && rightHead != null) {
            nextLeft = leftHead.next;
            leftHead.next = rightHead;
            nextRight = rightHead.next;
            rightHead.next = nextLeft;

            leftHead = nextLeft;
            rightHead = nextRight;
        }
    }

    public static void main(String[] args) {
        ZigZagLinkedList ll = new ZigZagLinkedList();
        ll.addFirst(6);
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
//        ll.addFirst(1);

        ll.print();
        ll.zigZag();
        ll.print();


    }
}
