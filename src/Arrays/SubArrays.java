package Arrays;

public class SubArrays {

    public static void printSubArrays(int arr[]){
        int totalSubArrays = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k]+" ");
                }
                totalSubArrays++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total sub-arrays = "+totalSubArrays);
    }
    public static void main(String args[]){
        int arr[] = {2, 4, 5, 6, 7, 8};
        printSubArrays(arr);
    }
    
}
