/*
 * All sorting algorithms in descending order.
 * 1. Bubble sort
 * 2. Selection sort
 * 3. Insertion sort
 * 4. Counting sort
 */
public class SortingInDescendingOrder {

    /*
     * Bubble sort
     */
    public static void bubbleSort(int arr[]) {
        for(int i=0; i<arr.length-1; i++) {
            for(int j=0; j<arr.length-i-1; j++) {
                if(arr[j] < arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    /*
     * Selection sort
     */
    public static void selectionSort(int arr[]) {
        for(int i=0; i<arr.length-1; i++) {
            int maxPosition = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[maxPosition] < arr[j]) {
                    maxPosition = j;
                }
            }
            int temp = arr[maxPosition];
            arr[maxPosition] = arr[i];
            arr[i] = temp;
        }
    } 

    /*
     * Insertion sort
     */
    public static void insertionSort(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;

            while(prev >=0 && arr[prev] < curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }

    /*
     * Counting sort
     */
    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        
        int count[] = new int[largest+1];
        for(int i=0; i<arr.length; i++) {
            count[arr[i]]++;
        }

        int j=0;
        for(int i=count.length-1; i>0; i--){
            while(count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }

        }
    }

    public static void printSortedArray(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        //bubbleSort(arr);
        //selectionSort(arr);
        //insertionSort(arr);
        countingSort(arr);
        printSortedArray(arr);
    }
    
}
