// if the end-time is sorted
package GreedyAlgorithms;

import java.util.ArrayList;

public class ActivitySelection {    // TC = O(n)
    public static void main(String[] args) {
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};
        // sorted end time basis
        int maxActivities = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // Ist activity
        maxActivities = 1;
        ans.add(0);
        int lastEnd = end[0];

        for (int i = 1; i < end.length; i++) {
            if (start[i] >= lastEnd) {
                maxActivities++;
                ans.add(i);
                lastEnd = end[i];
            }
        }
        System.out.println("Max activities = "+maxActivities);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();
    }
}
