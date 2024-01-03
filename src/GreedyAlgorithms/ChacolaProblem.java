package GreedyAlgorithms;

import java.util.Arrays;
import java.util.Collections;

public class ChacolaProblem {
    public static void main(String[] args) {
        int n = 4, m = 6;
        Integer costVer[] = {2, 1, 3, 1, 4};    // have to sort them in descending order
        Integer costHor[] = {4, 1, 2};

        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        int h = 0, v = 0;   // pointers to track horizontal and vertical cost arrays
        int hp = 1, vp = 1; // horizontal and vertical pieces
        int cost = 0;

        while (h < costHor.length && v < costVer.length) {
            if (costVer[v] <= costHor[h]) { // if horizontal cut is bigger
                cost += (costHor[h] * vp);  // cost = vertical pieces * horizontal cost
                hp++;
                h++;
            } else {
                cost += (costVer[v] * hp);
                vp++;
                v++;
            }
        }

        while (h < costHor.length) {
            cost += (costHor[h] * vp);
            hp++;
            h++;
        }

        while (v < costVer.length) {
            cost += (costVer[v] * hp);
            vp++;
            v++;
        }

        System.out.println("Minimum cost to cut into square pieces = "+cost);
    }
}
