package MethodsFunctions;

/*
 * Prime or not
 */
public class PrimeOrNot {
    public static boolean isPrime(int n){
        //boolean isPrime = true;

        if(n == 2){
            return true;
        }
        for(int i=2; i<=n-1; i++){
            if(n%i == 0){
                //isPrime = false;
                //break;
                return false;

            }
        }
        //return isPrime;
        return true;
    }

     
public static void main(String argd[]){
    System.out.println(isPrime(5));
    

    }
    
}
