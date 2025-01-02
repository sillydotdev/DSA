package Interview;

public class ReverseArray {

    public static void reverseArray (int arr[]) {
//        for (int i = arr.length - 1; i >= 0 ; i--) {
//            System.out.print( arr[i]+ " ");
//        }
//        System.out.println();

        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 6, 8, 10, 12, 14};
        reverseArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print( arr[i] + " ");
        }
    }
}
