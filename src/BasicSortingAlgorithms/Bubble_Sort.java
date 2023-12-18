package BasicSortingAlgorithms;//-------------Optimized BUBBLE Sort----------------

public class Bubble_Sort {

    public static void bubbleSort(int arr[]){
        //boolean swap = false;
        for(int turn=0; turn<arr.length-1; turn++){
            boolean swap = false;

            for(int j=0; j<arr.length-1-turn; j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
                
            }
            if(swap == false){
                System.out.println("Already sorted");
                break;
            }

            
        }

        
    }

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        //int arr[] = {3, 2, 1, 5, 6, 7};
        int arr[] = {1, 2, 3, 4, 5, 6};

        bubbleSort(arr);
        printArray(arr);
    }
    
}
