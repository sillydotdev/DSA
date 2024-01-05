package GreedyAlgorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class KthLargestOddNumberInRange {
    public static int largestOddNumberInRange(int lowerBound, int upperBound, int k) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = lowerBound; i <= upperBound; i++) {
            if (i % 2 != 0) {
                arr.add(i);
            }
        }
        Collections.sort(arr, Comparator.reverseOrder());
        if (k <= arr.size()) {
            return arr.get(k - 1);
        } else {
            return -1;
        }
    }
    public static void main(String[] args) {
        System.out.println(largestOddNumberInRange(-3, 3, 1));
//        System.out.println(largestOddNumberInRange(-10, 10, 8));
    }
}
