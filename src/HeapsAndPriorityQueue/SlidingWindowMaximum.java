package HeapsAndPriorityQueue;

import java.util.PriorityQueue;

public class SlidingWindowMaximum {
    static class Pair implements Comparable<Pair>{
        int value;
        int index;
        public Pair(int value, int index) {
            this.value = value;
            this.index = index;
        }

        @Override
        public int compareTo(Pair p2) {
            // ascending order
//            return this.number - p2.number;
            // descending order
            return p2.value - this.value;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int res[] = new int[arr.length-k+1];

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for (int i = 0; i < k; i++) {
            pq.add(new Pair(arr[i], i));
        }

        res[0] = pq.peek().value;

        for (int i = k; i < arr.length; i++) {
            while (pq.size() > 0 && pq.peek().index <= (i-k)) {
                pq.remove();
            }
            pq.add(new Pair(arr[i], i));
            res[i-k+1] = pq.peek().value;
        }

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
}


