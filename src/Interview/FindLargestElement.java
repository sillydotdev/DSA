package Interview;

import java.util.ArrayList;
import java.util.List;

public class FindLargestElement {

    public static void main(String[] args) {
        // Sample array (can be provided or initialized here)
        List<Integer> numbers = new ArrayList<>();

        // Adding elements to the List
        numbers.add(5);
        numbers.add(10);
        numbers.add(750);
        numbers.add(20);

        // Call the method to find the largest element
        int largest = findLargest(numbers);

        // Output the result
        System.out.println("The largest element in the array is: " + largest);
    }

//    /**
//     * Method to find the largest element in an array of integers.
//     * @param array The input integer array.
//     * @return The largest element found in the array.
//     */
    public static int findLargest(List<Integer> arrayList) {
        // Implement logic to find the largest element here
        int maxValue = Integer.MIN_VALUE;
        for(int i = 0; i<arrayList.size(); i++) {
            if(arrayList.get(i) > maxValue) {
                maxValue = arrayList.get(i);
            }
        }
        return maxValue;


        // Return the largest element found
    }
}