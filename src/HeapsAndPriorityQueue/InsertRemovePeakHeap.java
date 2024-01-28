package HeapsAndPriorityQueue;

import java.util.ArrayList;

public class InsertRemovePeakHeap {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {     // O(logn)
            // add at last index of arrayList
            arr.add(data);

            int x = arr.size() - 1;  // index of child
            int parent = (x - 1) / 2;  // index of parent

            // swap => to fix heap
            while (arr.get(x) < arr.get(parent)) {  // O(logn)
                int temp = arr.get(x);
                arr.set(x, arr.get(parent));
                arr.set(parent, temp);

                x = parent;
                parent = (x - 1) / 2;   // both x and parent will update after each swapping
            }
        }

        // Min or peek of a heap
        public int peek() {
            return arr.get(0);
        }

        // Heapify the Heap
        private void heapify(int i) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int minIndex = i;

            if (left < arr.size() && arr.get(left) < arr.get(minIndex)) {   // if left is less than root => min = left
                minIndex = left;
            }
            if (right < arr.size() && arr.get(right) < arr.get(minIndex)) {  // if right is less than root => min = right
                minIndex = right;
            }

            if (minIndex != i) {    // if "i" is not the min index, swap "i" with the min index found above
                int temp = arr.get(i);
                arr.set(i, arr.get(minIndex));
                arr.set(minIndex, temp);

                heapify(minIndex); // if after swapping the below nodes get disturbed, we call this function recursively
            }
        }

        // remove from the Heap
        public int remove() {
            int data = arr.get(0);

            // swap first and last elements(nodes)
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            // delete the last node
            arr.remove(arr.size()-1);

            // Heapify the Heap
            heapify(0);
            return data;
        }

        // If heap is empty
        public boolean isEmpty() {
            return arr.size() == 0;
        }
    }
    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while (!h.isEmpty()) {
            System.out.println(h.peek());
            h.remove();
        }
    }
}
