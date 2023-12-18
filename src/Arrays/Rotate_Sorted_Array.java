package Arrays;

//There is an integer array nums sorted in ascending order (with distinct values).
//Prior to being passed to your function, nums is possibly rotated at an unknown 
//pivot  index k (1  <=  k  <  nums.length)  such  that  the  resulting  array  is [nums[k], 
//nums[k+1],   ...,   nums[n-1], nums[0],   nums[1],   ...,   nums[k-1]] (0-indexed).   
//For   example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
//Given the array nums after the possible rotation and an integer target, returnthe index oftarget if it is in nums, or -1   
//if it is not in nums.You must write an algorithm with O(log n) runtime complexity.
public class Rotate_Sorted_Array {

    public static int sortedRotatedArray(int num[], int target){
        //special case
        if(num == null || num.length == 0){
            return -1;
        }
        int start = 0;
        int end = num.length - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(num[mid] == target){
                return mid;
            }
            if(num[start] < num[mid]){
                if(target >= num[start] && target < num[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else{
                if(target > num[mid] && target <= num[end]){
                    start = mid + 1;
                }
                else{
                    end = mid -1;
                }
            }
        }
        return -1;
           
    }
    public static void main(String args[]){
        int num[] = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(sortedRotatedArray(num, 6));
    }
    
}
