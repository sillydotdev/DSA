package ArrayLists;

import java.util.ArrayList;

public class PairSumOptimized {
    // Optimized ------ TC = O(n)
    public static boolean pairSum(ArrayList<Integer> list, int target) {
        int leftPointer = 0, rightPointer = list.size() - 1;
        while ((leftPointer != rightPointer)) {
            if(list.get(leftPointer) + list.get(rightPointer) == target) {
                return true;
            } else if (list.get(leftPointer) + list.get(rightPointer) < target) {   // if the sum < target, you have to increment leftPointer because the ArrayList is sorted and we have to go for target which is greater than the sum of 2 pointers
                leftPointer++;
            } else {
                rightPointer--;
            }
        }
        return  false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(pairSum(list, 5));
    }
}
