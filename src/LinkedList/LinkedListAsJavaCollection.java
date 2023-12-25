package LinkedList;

import java.util.LinkedList;

public class LinkedListAsJavaCollection {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addFirst(0);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addLast(1);
        ll.addLast(4);
        ll.addLast(5);
        System.out.println(ll);

        ll.removeFirst();
        ll.removeLast();
        ll.remove(1);

        System.out.println(ll);
    }
}
