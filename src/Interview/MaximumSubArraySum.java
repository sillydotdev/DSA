package Interview;

public class MaximumSubArraySum {

    public static void printSubArray(int arr[]) {

        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        int totalSubArrays = 0, sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                sum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                    sum += arr[k];
                }

                if(maxSum < sum) {
                    maxSum = sum;
                }
                if(minSum > sum) {
                    minSum = sum;
                }

                totalSubArrays++;
                System.out.println("------------------------Sum = " + sum + "");
            }
            System.out.println();
        }
        System.out.println("Total Sub-Arrays = " + totalSubArrays);
        System.out.println("Max Sum = " + maxSum);
        System.out.println("Min Sum = " + minSum);
    }

    public static void main(String args[]){
        int arr[] = {2, 4, 6, 8, 10};
        printSubArray(arr);
    }
}
