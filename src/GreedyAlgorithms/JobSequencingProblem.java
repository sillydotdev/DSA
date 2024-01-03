package GreedyAlgorithms;

import java.util.ArrayList;
import java.util.Collections;

public class JobSequencingProblem {
    static class Job {  // create the skeleton of the job
        int id; // A=1, B=2, C=3, D=4
        int deadline;
        int profit;
        public Job(int id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }
    public static void main(String[] args) {
        int jobInfo[][] = {{4, 20}, {1, 10}, {1, 40}, {1, 30}}; // job deadline and profit
        ArrayList<Job> jobs = new ArrayList<>();    // arraylist using the Job class skeleton

        for (int i = 0; i < jobInfo.length; i++) {  // put the jobInfo inside the new jobs arraylist
            jobs.add(new Job(i, jobInfo[i][0], jobInfo[i][1]));
        }

        Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit);  // sort jobs in descending order of profit

        ArrayList<Integer> seq = new ArrayList<>(); // create "seq" arrayList to store the job sequence that give maximum profit
        int time = 0;
        for (int i = 0; i < jobs.size(); i++) {
            Job curr = jobs.get(i); // the current job
            if (curr.deadline > time) { // if current jobs deadline is > time
                seq.add(curr.id);
                time++;
            }
        }
        System.out.println("Maximum jobs = "+seq.size());
        for (int i = 0; i < seq.size(); i++) {
            System.out.print(seq.get(i)+" ");
        }
        System.out.println();
    }
}
