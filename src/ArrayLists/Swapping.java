package ArrayLists;

import java.util.ArrayList;

public class Swapping {

    public static void swap(ArrayList<Integer> list, int index1, int index2) {
        int temp = list.get(index1);    // store index1 in temp
        list.set(index1, list.get(index2)); // set index2 value in index1
        list.set(index2, temp);     // now set index2 value to temp(which has original value of index1)
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int index1 = 2, index2 = 5;
        System.out.println("List before swapping: "+list);
        swap(list, index1, index2);
        System.out.println("List after swapping: "+list);

    }
}
