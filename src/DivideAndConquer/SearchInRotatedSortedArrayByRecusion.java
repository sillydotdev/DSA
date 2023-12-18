package DivideAndConquer;

public class SearchInRotatedSortedArrayByRecusion {

    public static int searchInRotatedSortedArray(int arr[], int target, int low, int high) {
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] == target) {
                return mid;
            }
            if(arr[low] < arr[mid]) {
                if(arr[low] <= target && target <= arr[mid]) {
                    return searchInRotatedSortedArray(arr, target, low, mid-1);
                }
                else{
                    return searchInRotatedSortedArray(arr, target, mid+1, high);
                }
            }
            else{
                if(arr[mid] <= target && target <= arr[high]) {
                    return searchInRotatedSortedArray(arr, target, mid+1, high);
                }
                else{
                    return searchInRotatedSortedArray(arr, target, low, mid-1);
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {7, 8, 9, 0, 1, 2, 3, 4};
        System.out.println(searchInRotatedSortedArray(arr, 1, 0, arr.length-1));
    }
    
}
