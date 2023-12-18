package Recursion;

public class IndicesOfElement {

    public static void indicesOfElement(int arr[], int key, int i) {
        /*
         * Brute force
         */
        // StringBuilder sb = new StringBuilder("");
        // for(int i=0; i<arr.length; i++) {
        //     if(arr[i] == key) {
        //         sb.append(i+" ");
        //     }
        // }
        // return sb.toString();


        /*
         * Recursive
         */
        if(i == arr.length){
            return;
        }

        if(arr[i] == key) {
            System.out.print(i+" ");
        }
        indicesOfElement(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 5, 6, 2, 7};
        indicesOfElement(arr, 2, 0);
    }
    
}
