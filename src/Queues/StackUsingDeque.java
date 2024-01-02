package Queues;

import java.util.Deque;
import java.util.LinkedList;

public class StackUsingDeque {
    static class Stack {
        static Deque<Integer> deque = new LinkedList<>();
        // add
        static void push(int data) {
            deque.addLast(data);
        }

        // remove
        static int pop() {
            return deque.removeLast();
        }

        // peek
        static int peek() {
            return deque.getLast();
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
