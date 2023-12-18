package MethodsFunctions;/*
 * Prime or not
 */

public class PrimeOrNot2 {
    public static boolean isPrime(int n){
        //boolean isPrime = true;

        if(n == 2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                //isPrime = false;
                //break;
                return false;

            }
        }
        //return isPrime;
        return true;
    }

    public static void primeInRange(int n){
        for(int i=2; i<=n; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

     
public static void main(String argd[]){
    primeInRange(100);
    

    }
    
}
