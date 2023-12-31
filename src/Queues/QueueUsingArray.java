package Queues;

public class QueueUsingArray {
    static class Queue {
        static int arr[];
        static int size;
        static int rear;
        public Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        // isEmpty or nor
        public static boolean isEmpty() {
            return rear == -1;
        }

        // add in a queue
        public static void add(int data) {
            if(rear == size - 1) {  // check if queue is full
                System.out.println("Queue is full.");
                return;
            }
            rear = rear + 1;
            arr[rear] = data;
        }

        // remove from Queue
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty.");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < size-1; i++) {
                arr[i] = arr[i+1];
            }
            rear = rear - 1;
            return front;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty.");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println("peek is"+q.peek());
            q.remove();
            System.out.println(q.peek());
        }
    }
}
