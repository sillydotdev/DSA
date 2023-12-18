package BasicSortingAlgorithms;//------------Java in-built sorting in reverse order---------

import java.util.*;;

public class InBuilt_Sort {
    
    public static void printArray(Integer arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        Integer arr[] = {3, 2, 1, 5, 6, 7};
        //Arrays.sort(arr, Collections.reverseOrder());
        Arrays.sort(arr, 1,3, Collections.reverseOrder());

        printArray(arr);
        
        
    }
    
}
