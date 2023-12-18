package DivideAndConquer;/*
 * Majority element in an array
 */

import java.util.Arrays;

public class MajorityElement {

    public static int majorityElement(int arr[]) {
        int n = arr.length;
        Arrays.sort(arr);
        return arr[n/2]; // arr[n/2] returns the element in the middle of the array... since majority element by definitio means
    }                    // that it exists more that n/2 times, so it will always be at the middle as well;
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 2, 3, 1, 0, 6};
        //int arr[] = {3, 2, 3};
        System.out.println(majorityElement(arr));
    }
}
