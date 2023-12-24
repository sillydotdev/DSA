package LinkedList;

public class ReverseLinkedList {

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

    // print a linkedList
    public void print() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // REVERSE a linkedList
    public static void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;   // reversed
            prev = curr;    // prv moved forward
            curr = next;    // curr moved forward
        }
        head = prev;    // ultimately prev reaches last element and is declared as head
    }

    // Remove nth element from the end
    public void removeNthFromEnd(int n) {
        // calculating size of LinkedList
        int lengthOfLinkedList = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            lengthOfLinkedList++;
        }

        if(n == lengthOfLinkedList) {   // removing head from the end
            head = head.next;
            return;
        }
        Node prev = head;
        for(int i=1; i<lengthOfLinkedList - n; i++) {   // i<lengthOfLinkedList - n because to find the node n(which is to be removed),
            prev = prev.next;                           // from the end, we can use the formula: size-n+1 to find that nth element from the head.
            i++;                                        // since we can not traverse from end of a linkedList
        }
        prev.next = prev.next.next;
        return;
    }
    public static void main(String[] args) {
        ReverseLinkedList ll = new ReverseLinkedList();   // LinkedList is created
        ll.addFirst(6);
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);

        ll.print();

//        ll.reverse();   // reverse method called
        ll.removeNthFromEnd(3);
        ll.print();     // LinkedList after reversed

    }
}
