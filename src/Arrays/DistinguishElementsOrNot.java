package Arrays;//----------------Assignment question 1-------------
// Given an integer array nums, return true if any value appears at least twice in the array, 
// and return false if every element is distinct.

public class DistinguishElementsOrNot {
    public static boolean checkArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<=i; j++){
                if(arr[i] == arr[j]){
                    return true;
                }

            }
        }
        return false;

    }
    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4, 5, 6, 1};
        System.out.println(checkArray(arr));
    }
    
}
