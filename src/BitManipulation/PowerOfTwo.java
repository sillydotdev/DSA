package BitManipulation;

/*
* Is power of 2
*/
public class PowerOfTwo {
    
    public static boolean isPowerOf2(int n){
        return (n & (n-1)) == 0;
    }

    public static void main(String args[]){

        System.out.println(isPowerOf2(16));
        System.out.println(isPowerOf2(5));
    }
    
}
