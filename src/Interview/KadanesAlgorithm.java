package Interview;

public class KadanesAlgorithm {

    public static int kadanesAlgorithm(int[] arr) {
        int currentSum = 0, maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

//            if(currentSum < 0) {
//                currentSum = 0;
//            }
//            maxSum = Math.max(currentSum, maxSum);
            maxSum = Math.max(currentSum, maxSum);
            if(currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Max Sum = " + kadanesAlgorithm(arr));
    }
}
