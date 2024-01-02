// end time is not sorted
package GreedyAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Activity_Selection {
    public static void main(String[] args) {
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {7, 9, 6, 2, 9, 4};

        // sort the endTime
        int activities[][] = new int[start.length][3];
        for (int i = 0; i < activities.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        // sorting the end time
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        ArrayList<Integer> ans = new ArrayList<>();
        int maxActivities = 1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];
        for (int i = 1; i < end.length; i++) {
            if (activities[i][1] >= lastEnd) {
                maxActivities++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }
        System.out.println("Maximum activities = "+maxActivities);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();
    }
}
