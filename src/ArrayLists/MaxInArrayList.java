package ArrayLists;

import java.util.ArrayList;

public class MaxInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++) {
//            if(max < list.get(i)) {       // one way
//                max = list.get(i);
//            }
            max = Math.max(max, list.get(i));   // another way
        }
        System.out.println("Max Element = "+max);

    }
}
