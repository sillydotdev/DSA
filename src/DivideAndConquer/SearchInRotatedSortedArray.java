package DivideAndConquer;

public class SearchInRotatedSortedArray {
    public static int searchInRotatedSortedArray(int arr[], int target) {
        int low = 0, high = arr.length-1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] == target) {
                return mid;
            }
            if(arr[low] < arr[mid]) {
                if(arr[low] <= target && target <= arr[mid]) {
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
            else{
                if(arr[mid] <= target && target <= arr[high]) {
                    low = mid +1;
                }
                else{
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {7, 8, 9, 0, 1, 2, 3, 4};
        System.out.println(searchInRotatedSortedArray(arr, 1));
    }
    
}
