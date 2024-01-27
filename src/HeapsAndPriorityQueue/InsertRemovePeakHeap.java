package HeapsAndPriorityQueue;

import java.util.ArrayList;

public class InsertRemovePeakHeap {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {     // O(logn)
            // add at las index of arrayList
            arr.add(data);

            int x = arr.size() - 1;  // index of child
            int parent = (x - 1) / 2;  // index of parent

            // swap
            while (arr.get(x) < arr.get(parent)) {  // O(logn)
                int temp = arr.get(x);
                arr.set(x, arr.get(parent));
                arr.set(parent, temp);
            }
        }

        // Min or peek of a heap
        public int peek() {
            return arr.get(0);
        }
    }
    public static void main(String[] args) {

    }
}
