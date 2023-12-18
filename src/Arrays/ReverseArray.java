package Arrays;

public class ReverseArray {

    public static void reverseArray(int numbers[]){
        int start = 0, end = numbers.length - 1;
        while(start < end){
            int temp = numbers[end];
            numbers[end] = numbers[start];
            numbers[start] = temp;
            start++;
            end--;
        }
    }

    public static void main(String args[]){
        int numbers[] = {2, 5, 6, 7, 3, 7};

        reverseArray(numbers);
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }
    
}
