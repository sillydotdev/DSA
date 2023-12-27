package Stacks;

import java.util.ArrayList;

public class StackUsingArrayList {
    public static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty() {
            return list.size() == 0;
        }
        // push
        public static void push(int data) {
            list.add(data);
        }
        // pop
        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1);
        }

        public static void print() {
            System.out.println(list);
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        s.print();

        while (!s.isEmpty()) {
            System.out.println("Peek element is: "+s.peek());
            System.out.println("Pop from stack: "+s.pop());
            s.print();
        }
    }
}
