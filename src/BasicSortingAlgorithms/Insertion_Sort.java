package BasicSortingAlgorithms;//-------------INSERTION Sort----------------

public class Insertion_Sort {

    public static void insertionSort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;

            //finding the correct position to insert
            while(prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }

            //inserting
            arr[prev+1] = curr;

        }

            
    }
    

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        int arr[] = {3, 2, 1, 5, 6, 7};
        insertionSort(arr);
        printArray(arr);
    }
    
}
