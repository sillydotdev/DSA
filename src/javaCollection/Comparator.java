package javaCollection;

import java.util.ArrayList;
import java.util.Collections;

public class Comparator {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(11);
        arr.add(2);
        arr.add(31);
        arr.add(4);
        arr.add(5);
        arr.add(16);

        Collections.sort(arr, (o1, o2) -> o2-o1);
        System.out.println(arr);
    }
}
