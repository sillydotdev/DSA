package ArrayLists;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(51);
        list.add(11);
        list.add(31);
        list.add(4);
        list.add(2);
        list.add(6);

        System.out.println(list);

        // sorting in ascending order
        Collections.sort(list);
        System.out.println(list);

        // sorting in descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

    }
}
