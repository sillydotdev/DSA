public class Factorial {

    public static int fact(int n) {

        if(n == 0) {
            return 1;
        }
        int fnm1 = fact(n-1);          //for convenience fnm1  means  f(n minus 1)
        int fn = n * fact(n-1);         //fn means f of n
        return fn;
        //return n * fact(n-1);    // or just write this line

    }
    public static void main(String[] args) {
        System.out.println(fact(5));

    }
    
}
