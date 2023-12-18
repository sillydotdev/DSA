package Arrays;//-----------------Kadane's Algorithm for max sum of subarrays-------------

public class KadanesAlgorithm {

    public static void kadane(int numbers[]){
        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++){
            curSum = curSum + numbers[i];

            if(curSum < 0){
                curSum = 0;
            }
            maxSum = Math.max(curSum, maxSum); 
        }
        System.out.println("Max sum of sub-array is: "+maxSum);

    }

    public static void main(String args[]){
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadane(numbers);
    }
    
}
