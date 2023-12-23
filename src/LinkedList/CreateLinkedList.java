package LinkedList;

public class CreateLinkedList {
    // inner class to create a NODE for LinkedList
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
    // add Node at the head -------- TC = O(1)
    public void addFirst(int data) {
        // step-1: create a new Node
        Node newNode = new Node(data);
        if(head == null) {  // if there is no node in the linkedList in the first place
            head = tail = newNode;
            return;
        }
        // step-2: newNode's next points to head
        newNode.next = head;
        // step-3: newNode = head
        head = newNode;
    }

    // add node at the tail -------- TC = O(1)
    public void addLast(int data) {
        if(head == null) {
            System.out.println("LinkedList is empty");
        }
        Node newNode = new Node(data);
        if(head == null) {  // we don't write tail == null because by convention we always check it by head == null
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
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

    // add in the middle of linkedList
    public void add(int index, int data) {
        if(index == 0) {    // if you want to add at the first index. this is a special case for adding at head.
            addFirst(data); // Has to be mentioned as the value of head will change. So calling the addFirst() method
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        while(i < index - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;   // temp is previous, so new node's next will point to temp's next
        temp.next = newNode;    // after then temp next will point to newNode
    }
    public static void main(String[] args) {
        CreateLinkedList ll = new CreateLinkedList();   // LinkedList is created
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);

        ll.add(2, 9);
        ll.print();
    }
}
