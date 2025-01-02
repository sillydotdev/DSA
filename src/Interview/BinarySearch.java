package Interview;

public class BinarySearch {

    public static int binarySearch(int[] arr, int key) {
        int start = 0, end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == key) {
                return mid;
            } else if(arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 6, 8, 10, 12, 14};
        int key = 10;
        System.out.println("Index for key is: " + binarySearch(arr, key));
    }
}
