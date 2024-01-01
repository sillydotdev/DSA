// here pop or remove operation is done in  0(n)
package Queues;

import java.util.Stack;

public class QueueUsingTwoStacks {
    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        static boolean isEmpty() {
            return s1.isEmpty();
        }

        // add
        static void add(int data) {
            s1.push(data);
        }

        // remove
        static int remove() {
            if (s2.isEmpty()) {
                while (!s1.isEmpty()) {
                    s2.push(s1.peek());
                    s1.pop();
                }
            }
            int x = s2.peek();
            s2.pop();
            return x;
        }

        // peek
        static int peek() {
            if (s2.isEmpty()) {
                while (!s1.isEmpty()) {
                    s2.push(s1.peek());
                    s1.pop();
                }
            }
            return s2.peek();
        }
    }
        public static void main(String[] args) {
            Queue q = new Queue();
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);

            while (!q.isEmpty()) {
                System.out.println(q.peek());
                q.remove();
            }
        }
    }