package BasicSortingAlgorithms;//-------------SELECTION Sort----------------

public class Selection_Sort {

    public static void selectionSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){

            int minPostion = i;
            for(int j=i+1; j<arr.length; j++){
                // for descending order
                // if(arr[minPostion] > arr[j]){
                //     minPostion = j;
                // }

                if(arr[minPostion] > arr[j]){
                    minPostion = j;
                }
                
            }
            //swap
            int temp = arr[minPostion];
            arr[minPostion] = arr[i];
            arr[i] = temp;

            
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
        selectionSort(arr);
        printArray(arr);
    }
    
}
