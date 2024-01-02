package Queues;

import java.util.Deque;
import java.util.LinkedList;

public class DequeBasics {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);
        deque.addLast(4);
        deque.addLast(5);

        System.out.println(deque);

        System.out.println("Get first: "+deque.getFirst());
        System.out.println("Get last: "+deque.getLast());

        deque.removeFirst();
        System.out.println("After removing first: "+deque);

        deque.removeLast();
        System.out.println("After removing last: "+deque);
    }
}
