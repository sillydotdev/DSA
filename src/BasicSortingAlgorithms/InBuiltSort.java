package BasicSortingAlgorithms;//------------Java in-built sort-----------

import java.util.Arrays;

public class InBuiltSort {
    
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        int arr[] = {3, 2, 1, 5, 6, 7};
        //Arrays.sort(arr);
        Arrays.sort(arr, 1, 3);
        printArray(arr);
        
        
    }
    
}
