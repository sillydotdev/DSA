package ArrayLists;

import java.util.ArrayList;

public class PairSum2 {
    public static boolean pairSum(ArrayList<Integer> list, int target) {
        int breakingPoint = -1;
        int n = list.size();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) > list.get(i+1)) {
                breakingPoint = i;
                break;
            }
        }

        int leftPointer = breakingPoint + 1, rightPointer = breakingPoint;
        
        while (leftPointer != rightPointer) {
            if(list.get(leftPointer) + list.get(rightPointer) == target) {
                return true;
            } else if (list.get(leftPointer) + list.get(rightPointer) < target) {
                leftPointer = (leftPointer + 1) % n;
            } else{
                rightPointer = (n + rightPointer - 1) % n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        System.out.println(pairSum(list, 16));
    }
}
