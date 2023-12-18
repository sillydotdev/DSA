/*
 * Inversion count of an array
 */

public class InversionCountOfArray {

    public static int inversionCountOfArray(int arr[]) {
        // for(int i=0; i<=arr.length-1; i++) {
        //     for(int j=i+1; j<=arr.length-1; j++){
        //         if(arr[i] > arr[j]){
        //             count++;
        //         }
        //     }
        // }
        int n = arr.length;
        return mergeSort(arr, 0, n-1);
    }

    public static int mergeSort(int[] arr, int left, int right) {
        int invCount = 0;
        if(right > left) {
            int mid = left + (right - left) / 2;
            invCount = mergeSort(arr, left, mid);
            invCount += mergeSort(arr, mid+1, right);
            invCount += merge(arr, left, mid+1, right);
        }
        return invCount;
    }

    public static int merge(int arr[], int left, int mid, int right) {
        int invCount = 0;
        int i = left, j = mid, k = 0;
        int temp[] = new int[(right - left + 1)];

        while(i < mid && j <= right) {
            if(arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                invCount += (mid-1);
                j++;
            }
            k++;
        }

        while(i < mid){
            temp[k++] = arr[i++];
        }
        while(j <= right) {
            temp[k++] = arr[j++];
        }

        for(i=left, k=0; i<=right; i++, k++) {
            arr[i] = temp[k];
        }
        return invCount;
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 1, 3, 5};
        System.out.println("Inversion count= "+inversionCountOfArray(arr));
    }
    
}
