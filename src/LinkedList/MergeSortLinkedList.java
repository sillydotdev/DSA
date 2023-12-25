package LinkedList;

public class MergeSortLinkedList {
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

    // MERGE Sort code
    // calculate the mid
    public Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;  // .next so that the mid will be the last element of left half
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // merge the two halves
    public Node merge(Node head1, Node head2) { // merge function after the division
        Node mergedLinkedList = new Node(-1);   // creating temporary LL with -1
        Node temp = mergedLinkedList;   // temp variable to traverse over the above temporary LL

        while(head1 != null && head2 != null) {
            if(head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedLinkedList.next;   // initialized it with -1... so .next to point to head and drop the -1
    }
    public Node mergeSort(Node head) {  // mergeSort method
        if(head == null || head.next == null) {
            return head;
        }
        Node mid = getMid(head);
        Node rightHead = mid.next;  // head of the right half
        mid.next = null;    // mid.next = null indicates that the LL id divided into 2 halves
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        return merge(newLeft, newRight);
    }
    public static void main(String[] args) {
        MergeSortLinkedList ll = new MergeSortLinkedList();   // LinkedList is created
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addFirst(6);

        ll.print();

        ll.head = ll.mergeSort(ll.head);

        ll.print();
    }
}
