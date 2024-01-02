package GreedyAlgorithms;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int weight[] = {10, 20, 30};
        int value[] = {60, 100,120};
        int w = 50;

        double ratio[][] = new double[value.length][2];
        for (int i = 0; i < value.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = value[i] / (double)weight[i];
        }

        // sort on ratio
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = w;
        int finalValue = 0;

        for (int i = ratio.length-1; i >= 0; i--) {
            int index = (int)ratio[i][0];
            if(capacity >= weight[index]) {
                finalValue += value[index];
                capacity -= weight[index];
            } else {
                finalValue += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }
        System.out.println("Final value = "+finalValue);
    }
}
