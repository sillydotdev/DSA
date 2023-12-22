package ArrayLists;

import java.util.ArrayList;

public class ContainerWithMostWater {
    // brute force ----- TC = O(n^2)
    public static int storeWater(ArrayList<Integer> height) {
        int maxWater = 0;
        for(int i=0; i<height.size(); i++) {
            for(int j=i+1; j<height.size(); j++) {
                // height
                int ht = Math.min(height.get(i), height.get(j));
                // width
                int width = j - i;
                // current water stored
                int currWater = ht * width;
                maxWater = Math.max(maxWater, currWater);
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(storeWater(height));
    }
}
