package ArrayLists;

import java.util.ArrayList;

public class ArrayList2D {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(4);
        list1.add(5);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(7);
        list2.add(8);
        list2.add(9);

        mainList.add(list1);
        mainList.add(list2);

        System.out.print(mainList+"\n");
        
        // print these 2 lists
        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }
    }
}
