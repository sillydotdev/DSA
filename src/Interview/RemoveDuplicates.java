package Interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicates {
    public static List<Integer> removeDuplicates(List<Integer> numbers) {
        // Your code here
        HashSet<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for(Integer number : numbers) {
            if(set.add(number)) {
                result.add(number);
            }
        }
        return result;


    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 2, 6, 6, 9, 9, 3, 4, 4, 5, 5 );
        List<Integer> uniqueNumbers = removeDuplicates(numbers);
        System.out.println(uniqueNumbers); // Output: [1, 2, 3, 4, 5]
    }
}