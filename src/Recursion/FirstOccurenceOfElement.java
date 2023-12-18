public class FirstOccurenceOfElement {

    public static int firstOccurence(int arr[], int key, int i) {

        if(i == arr.length) {
            return -1; 
        }
        if(arr[i] == key) {
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 6, 7, 3, 5, 7};
        System.out.println(firstOccurence(arr, 7, 0));
    }
    
}
