package LinkedList;

public class SearchInLinkedList {
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

    // Iterative search in a LinkedList
    public static int iterativeSearch(int key) {
        Node temp = head;
        int index = 0;
        while (temp != null) {
            if(temp.data == key) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }

    // Search in a linkedList using RECURSION
    public int helper(Node head, int key) { // helper function
        if(head == null) {
            return -1;
        }
        if(head.data == key) {
            return 0;
        }
        int index = helper(head.next, key);
        if(index == -1) {
            return -1;
        }
        return index + 1;
    }

    public int recursiveSearch(int key) {   // recursion
        return helper(head, key);
    }

//    // Recursive approach directly in one function
//    public int recursiveSearch(Node head, int key) {
//        if(head == null) {
//            return -1;
//        }
//        if(head.data == key) {
//            return 0;
//        }
//        int index = recursiveSearch(head.next, key);
//        if(index == -1) {
//            return -1;
//        }
//        return index + 1;
//    }
    public static void main(String[] args) {
        SearchInLinkedList ll = new SearchInLinkedList();   // LinkedList is created
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addFirst(6);

        ll.print();
//        System.out.println(ll.iterativeSearch(4));
//        System.out.println(ll.iterativeSearch(10));

        System.out.println(ll.recursiveSearch(4));  // recursive search using helper function
        System.out.println(ll.recursiveSearch(10));

//        System.out.println(ll.recursiveSearch(head, 4));  // recursive search using one function
//        System.out.println(ll.recursiveSearch(head, 10));

    }
}
