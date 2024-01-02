package Queues;

import java.util.Deque;
import java.util.LinkedList;

public class QueueUsingDeque {
    static class Queue {
        static Deque<Integer> deque = new LinkedList<>();

        // add
        static void add(int data) {
            deque.addLast(data);
        }

        // remove
        static int remove() {
            return deque.removeFirst();
        }

        // peek
        static int peek() {
            return deque.getFirst();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}
